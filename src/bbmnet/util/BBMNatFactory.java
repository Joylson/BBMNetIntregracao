/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbmnet.util;

import java.util.List;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

/**
 *
 * @author jtmir
 */
public class BBMNatFactory {

    private final SOAPHandlerImp sOAPHandlerImp;
    private bbmnet.ws.IWCFIntegracao port;

    private BBMNatFactory(SOAPHandlerImp sOAPHandlerImp) {
        this.sOAPHandlerImp = sOAPHandlerImp;
        _getPort();
    }

    public static BBMNatFactory createBBMNatFactory(SOAPHandlerImp sOAPHandlerImp) {
        return new BBMNatFactory(sOAPHandlerImp);
    }

    private void _addHandler(Object port) {
        BindingProvider provider = (BindingProvider) port;
        List<Handler> handlers = provider.getBinding().getHandlerChain();
        handlers.add(this.sOAPHandlerImp);
        provider.getBinding().setHandlerChain(handlers);
    }

    private void _getPort() {
        bbmnet.ws.WCFIntegracao service = new bbmnet.ws.WCFIntegracao();
        port = service.getBasicHttpBindingIWCFIntegracao();
        _addHandler(port);
    }

    public void enviarFoto(java.lang.String protocoloProcessamento, java.math.BigDecimal codigoProdutoBBM, java.lang.String codigoProdutoOrgao, java.lang.Integer numeroLote, byte[] fotoProcessamento, java.lang.String nomeArquivo, java.lang.Integer numeroSequencia, java.lang.Integer numeroItem) {
        port.enviarFoto(protocoloProcessamento, codigoProdutoBBM, codigoProdutoOrgao, numeroLote, fotoProcessamento, nomeArquivo, numeroSequencia, numeroItem);
    }

    public String enviarEdital(java.lang.String editalXml) {
        return port.enviarEdital(editalXml);
    }

    public void enviarAnexo(java.lang.String protocoloProcessamento, java.lang.Integer numeroSequencia, byte[] anexo, java.lang.String nomeArquivo, java.lang.String descricao, java.lang.Boolean isEdital) {
        port.enviarAnexo(protocoloProcessamento, numeroSequencia, anexo, nomeArquivo, descricao, isEdital);
    }

    public String consultarUnidadesMedida() {
        return port.consultarUnidadesMedida();
    }

    public String consultarUltimoSequencial() {
        return port.consultarUltimoSequencial();
    }

    public String consultarProdutosPaginado(java.lang.String pesquisa, java.lang.Boolean produtosOrgao, java.lang.Boolean produtosBBM, java.lang.String expressaoOrdenamento, java.lang.Integer quantidadeLinhas, java.lang.Integer inicio) {
        return port.consultarProdutosPaginado(pesquisa, produtosOrgao, produtosBBM, expressaoOrdenamento, quantidadeLinhas, inicio);
    }

    public String consultarEditalResultado(java.lang.String protocolo) {
        return port.consultarEditalResultado(protocolo);
    }

    public String consultarEditalEnviado(java.lang.String protocolo) {
        return port.consultarEditalEnviado(protocolo);
    }

    public String consultarEdital(java.lang.Integer codigoEdital) {
        return port.consultarEdital(codigoEdital);
    }

}
