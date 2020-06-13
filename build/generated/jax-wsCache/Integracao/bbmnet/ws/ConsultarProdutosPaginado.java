
package bbmnet.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pesquisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="produtosOrgao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="produtosBBM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expressaoOrdenamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantidadeLinhas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pesquisa",
    "produtosOrgao",
    "produtosBBM",
    "expressaoOrdenamento",
    "quantidadeLinhas",
    "inicio"
})
@XmlRootElement(name = "ConsultarProdutosPaginado")
public class ConsultarProdutosPaginado {

    @XmlElementRef(name = "pesquisa", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pesquisa;
    protected Boolean produtosOrgao;
    protected Boolean produtosBBM;
    @XmlElementRef(name = "expressaoOrdenamento", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expressaoOrdenamento;
    protected Integer quantidadeLinhas;
    protected Integer inicio;

    /**
     * Obtém o valor da propriedade pesquisa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPesquisa() {
        return pesquisa;
    }

    /**
     * Define o valor da propriedade pesquisa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPesquisa(JAXBElement<String> value) {
        this.pesquisa = value;
    }

    /**
     * Obtém o valor da propriedade produtosOrgao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProdutosOrgao() {
        return produtosOrgao;
    }

    /**
     * Define o valor da propriedade produtosOrgao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProdutosOrgao(Boolean value) {
        this.produtosOrgao = value;
    }

    /**
     * Obtém o valor da propriedade produtosBBM.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProdutosBBM() {
        return produtosBBM;
    }

    /**
     * Define o valor da propriedade produtosBBM.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProdutosBBM(Boolean value) {
        this.produtosBBM = value;
    }

    /**
     * Obtém o valor da propriedade expressaoOrdenamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpressaoOrdenamento() {
        return expressaoOrdenamento;
    }

    /**
     * Define o valor da propriedade expressaoOrdenamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpressaoOrdenamento(JAXBElement<String> value) {
        this.expressaoOrdenamento = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeLinhas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeLinhas() {
        return quantidadeLinhas;
    }

    /**
     * Define o valor da propriedade quantidadeLinhas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeLinhas(Integer value) {
        this.quantidadeLinhas = value;
    }

    /**
     * Obtém o valor da propriedade inicio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInicio() {
        return inicio;
    }

    /**
     * Define o valor da propriedade inicio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInicio(Integer value) {
        this.inicio = value;
    }

}
