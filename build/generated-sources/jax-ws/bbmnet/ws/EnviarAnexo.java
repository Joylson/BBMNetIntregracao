
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
 *         &lt;element name="protocoloProcessamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroSequencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="anexo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="nomeArquivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isEdital" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "numeroSequencia",
    "anexo",
    "nomeArquivo",
    "descricao",
    "isEdital"
})
@XmlRootElement(name = "EnviarAnexo")
public class EnviarAnexo {

    @XmlElementRef(name = "protocoloProcessamento", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocoloProcessamento;
    protected Integer numeroSequencia;
    @XmlElementRef(name = "anexo", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> anexo;
    @XmlElementRef(name = "nomeArquivo", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomeArquivo;
    @XmlElementRef(name = "descricao", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricao;
    protected Boolean isEdital;

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
     * Obtém o valor da propriedade anexo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getAnexo() {
        return anexo;
    }

    /**
     * Define o valor da propriedade anexo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setAnexo(JAXBElement<byte[]> value) {
        this.anexo = value;
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
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescricao(JAXBElement<String> value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade isEdital.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEdital() {
        return isEdital;
    }

    /**
     * Define o valor da propriedade isEdital.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEdital(Boolean value) {
        this.isEdital = value;
    }

}
