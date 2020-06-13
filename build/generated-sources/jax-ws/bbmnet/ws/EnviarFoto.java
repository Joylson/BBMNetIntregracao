
package bbmnet.ws;

import java.math.BigDecimal;
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
 *         &lt;element name="protocoloProcessamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoProdutoBBM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="codigoProdutoOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroLote" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fotoProcessamento" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="nomeArquivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroSequencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroItem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "protocoloProcessamento",
    "codigoProdutoBBM",
    "codigoProdutoOrgao",
    "numeroLote",
    "fotoProcessamento",
    "nomeArquivo",
    "numeroSequencia",
    "numeroItem"
})
@XmlRootElement(name = "EnviarFoto")
public class EnviarFoto {

    @XmlElementRef(name = "protocoloProcessamento", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocoloProcessamento;
    protected BigDecimal codigoProdutoBBM;
    @XmlElementRef(name = "codigoProdutoOrgao", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoProdutoOrgao;
    protected Integer numeroLote;
    @XmlElementRef(name = "fotoProcessamento", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> fotoProcessamento;
    @XmlElementRef(name = "nomeArquivo", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeArquivo;
    protected Integer numeroSequencia;
    protected Integer numeroItem;

    /**
     * Obtém o valor da propriedade protocoloProcessamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocoloProcessamento() {
        return protocoloProcessamento;
    }

    /**
     * Define o valor da propriedade protocoloProcessamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocoloProcessamento(JAXBElement<String> value) {
        this.protocoloProcessamento = value;
    }

    /**
     * Obtém o valor da propriedade codigoProdutoBBM.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCodigoProdutoBBM() {
        return codigoProdutoBBM;
    }

    /**
     * Define o valor da propriedade codigoProdutoBBM.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCodigoProdutoBBM(BigDecimal value) {
        this.codigoProdutoBBM = value;
    }

    /**
     * Obtém o valor da propriedade codigoProdutoOrgao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoProdutoOrgao() {
        return codigoProdutoOrgao;
    }

    /**
     * Define o valor da propriedade codigoProdutoOrgao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoProdutoOrgao(JAXBElement<String> value) {
        this.codigoProdutoOrgao = value;
    }

    /**
     * Obtém o valor da propriedade numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroLote(Integer value) {
        this.numeroLote = value;
    }

    /**
     * Obtém o valor da propriedade fotoProcessamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFotoProcessamento() {
        return fotoProcessamento;
    }

    /**
     * Define o valor da propriedade fotoProcessamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFotoProcessamento(JAXBElement<byte[]> value) {
        this.fotoProcessamento = value;
    }

    /**
     * Obtém o valor da propriedade nomeArquivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeArquivo() {
        return nomeArquivo;
    }

    /**
     * Define o valor da propriedade nomeArquivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeArquivo(JAXBElement<String> value) {
        this.nomeArquivo = value;
    }

    /**
     * Obtém o valor da propriedade numeroSequencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroSequencia() {
        return numeroSequencia;
    }

    /**
     * Define o valor da propriedade numeroSequencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroSequencia(Integer value) {
        this.numeroSequencia = value;
    }

    /**
     * Obtém o valor da propriedade numeroItem.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroItem() {
        return numeroItem;
    }

    /**
     * Define o valor da propriedade numeroItem.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroItem(Integer value) {
        this.numeroItem = value;
    }

}
