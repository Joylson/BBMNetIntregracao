
package bbmnet.ws;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bbmnet.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _EnviarAnexoNomeArquivo_QNAME = new QName("http://tempuri.org/", "nomeArquivo");
    private final static QName _EnviarAnexoAnexo_QNAME = new QName("http://tempuri.org/", "anexo");
    private final static QName _EnviarAnexoProtocoloProcessamento_QNAME = new QName("http://tempuri.org/", "protocoloProcessamento");
    private final static QName _EnviarAnexoDescricao_QNAME = new QName("http://tempuri.org/", "descricao");
    private final static QName _EnviarFotoFotoProcessamento_QNAME = new QName("http://tempuri.org/", "fotoProcessamento");
    private final static QName _EnviarFotoCodigoProdutoOrgao_QNAME = new QName("http://tempuri.org/", "codigoProdutoOrgao");
    private final static QName _ConsultarEditalEnviadoProtocolo_QNAME = new QName("http://tempuri.org/", "protocolo");
    private final static QName _ConsultarUltimoSequencialResponseConsultarUltimoSequencialResult_QNAME = new QName("http://tempuri.org/", "ConsultarUltimoSequencialResult");
    private final static QName _ConsultarUnidadesMedidaResponseConsultarUnidadesMedidaResult_QNAME = new QName("http://tempuri.org/", "ConsultarUnidadesMedidaResult");
    private final static QName _ConsultarProdutosPaginadoPesquisa_QNAME = new QName("http://tempuri.org/", "pesquisa");
    private final static QName _ConsultarProdutosPaginadoExpressaoOrdenamento_QNAME = new QName("http://tempuri.org/", "expressaoOrdenamento");
    private final static QName _ConsultarProdutosPaginadoResponseConsultarProdutosPaginadoResult_QNAME = new QName("http://tempuri.org/", "ConsultarProdutosPaginadoResult");
    private final static QName _ConsultarEditalResultadoResponseConsultarEditalResultadoResult_QNAME = new QName("http://tempuri.org/", "ConsultarEditalResultadoResult");
    private final static QName _EnviarEditalResponseEnviarEditalResult_QNAME = new QName("http://tempuri.org/", "EnviarEditalResult");
    private final static QName _ConsultarEditalEnviadoResponseConsultarEditalEnviadoResult_QNAME = new QName("http://tempuri.org/", "ConsultarEditalEnviadoResult");
    private final static QName _EnviarEditalEditalXml_QNAME = new QName("http://tempuri.org/", "editalXml");
    private final static QName _ConsultarEditalResponseConsultarEditalResult_QNAME = new QName("http://tempuri.org/", "ConsultarEditalResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bbmnet.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarEditalResultadoResponse }
     * 
     */
    public ConsultarEditalResultadoResponse createConsultarEditalResultadoResponse() {
        return new ConsultarEditalResultadoResponse();
    }

    /**
     * Create an instance of {@link ConsultarProdutosPaginadoResponse }
     * 
     */
    public ConsultarProdutosPaginadoResponse createConsultarProdutosPaginadoResponse() {
        return new ConsultarProdutosPaginadoResponse();
    }

    /**
     * Create an instance of {@link EnviarAnexoResponse }
     * 
     */
    public EnviarAnexoResponse createEnviarAnexoResponse() {
        return new EnviarAnexoResponse();
    }

    /**
     * Create an instance of {@link ConsultarEditalResultado }
     * 
     */
    public ConsultarEditalResultado createConsultarEditalResultado() {
        return new ConsultarEditalResultado();
    }

    /**
     * Create an instance of {@link ConsultarUltimoSequencialResponse }
     * 
     */
    public ConsultarUltimoSequencialResponse createConsultarUltimoSequencialResponse() {
        return new ConsultarUltimoSequencialResponse();
    }

    /**
     * Create an instance of {@link ConsultarUnidadesMedida }
     * 
     */
    public ConsultarUnidadesMedida createConsultarUnidadesMedida() {
        return new ConsultarUnidadesMedida();
    }

    /**
     * Create an instance of {@link EnviarAnexo }
     * 
     */
    public EnviarAnexo createEnviarAnexo() {
        return new EnviarAnexo();
    }

    /**
     * Create an instance of {@link EnviarFoto }
     * 
     */
    public EnviarFoto createEnviarFoto() {
        return new EnviarFoto();
    }

    /**
     * Create an instance of {@link ConsultarEditalResponse }
     * 
     */
    public ConsultarEditalResponse createConsultarEditalResponse() {
        return new ConsultarEditalResponse();
    }

    /**
     * Create an instance of {@link ConsultarEdital }
     * 
     */
    public ConsultarEdital createConsultarEdital() {
        return new ConsultarEdital();
    }

    /**
     * Create an instance of {@link ConsultarProdutosPaginado }
     * 
     */
    public ConsultarProdutosPaginado createConsultarProdutosPaginado() {
        return new ConsultarProdutosPaginado();
    }

    /**
     * Create an instance of {@link EnviarEditalResponse }
     * 
     */
    public EnviarEditalResponse createEnviarEditalResponse() {
        return new EnviarEditalResponse();
    }

    /**
     * Create an instance of {@link ConsultarEditalEnviadoResponse }
     * 
     */
    public ConsultarEditalEnviadoResponse createConsultarEditalEnviadoResponse() {
        return new ConsultarEditalEnviadoResponse();
    }

    /**
     * Create an instance of {@link ConsultarUltimoSequencial }
     * 
     */
    public ConsultarUltimoSequencial createConsultarUltimoSequencial() {
        return new ConsultarUltimoSequencial();
    }

    /**
     * Create an instance of {@link ConsultarUnidadesMedidaResponse }
     * 
     */
    public ConsultarUnidadesMedidaResponse createConsultarUnidadesMedidaResponse() {
        return new ConsultarUnidadesMedidaResponse();
    }

    /**
     * Create an instance of {@link EnviarEdital }
     * 
     */
    public EnviarEdital createEnviarEdital() {
        return new EnviarEdital();
    }

    /**
     * Create an instance of {@link ConsultarEditalEnviado }
     * 
     */
    public ConsultarEditalEnviado createConsultarEditalEnviado() {
        return new ConsultarEditalEnviado();
    }

    /**
     * Create an instance of {@link EnviarFotoResponse }
     * 
     */
    public EnviarFotoResponse createEnviarFotoResponse() {
        return new EnviarFotoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nomeArquivo", scope = EnviarAnexo.class)
    public JAXBElement<String> createEnviarAnexoNomeArquivo(String value) {
        return new JAXBElement<String>(_EnviarAnexoNomeArquivo_QNAME, String.class, EnviarAnexo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "anexo", scope = EnviarAnexo.class)
    public JAXBElement<byte[]> createEnviarAnexoAnexo(byte[] value) {
        return new JAXBElement<byte[]>(_EnviarAnexoAnexo_QNAME, byte[].class, EnviarAnexo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "protocoloProcessamento", scope = EnviarAnexo.class)
    public JAXBElement<String> createEnviarAnexoProtocoloProcessamento(String value) {
        return new JAXBElement<String>(_EnviarAnexoProtocoloProcessamento_QNAME, String.class, EnviarAnexo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "descricao", scope = EnviarAnexo.class)
    public JAXBElement<String> createEnviarAnexoDescricao(String value) {
        return new JAXBElement<String>(_EnviarAnexoDescricao_QNAME, String.class, EnviarAnexo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fotoProcessamento", scope = EnviarFoto.class)
    public JAXBElement<byte[]> createEnviarFotoFotoProcessamento(byte[] value) {
        return new JAXBElement<byte[]>(_EnviarFotoFotoProcessamento_QNAME, byte[].class, EnviarFoto.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nomeArquivo", scope = EnviarFoto.class)
    public JAXBElement<String> createEnviarFotoNomeArquivo(String value) {
        return new JAXBElement<String>(_EnviarAnexoNomeArquivo_QNAME, String.class, EnviarFoto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "protocoloProcessamento", scope = EnviarFoto.class)
    public JAXBElement<String> createEnviarFotoProtocoloProcessamento(String value) {
        return new JAXBElement<String>(_EnviarAnexoProtocoloProcessamento_QNAME, String.class, EnviarFoto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codigoProdutoOrgao", scope = EnviarFoto.class)
    public JAXBElement<String> createEnviarFotoCodigoProdutoOrgao(String value) {
        return new JAXBElement<String>(_EnviarFotoCodigoProdutoOrgao_QNAME, String.class, EnviarFoto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "protocolo", scope = ConsultarEditalEnviado.class)
    public JAXBElement<String> createConsultarEditalEnviadoProtocolo(String value) {
        return new JAXBElement<String>(_ConsultarEditalEnviadoProtocolo_QNAME, String.class, ConsultarEditalEnviado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "protocolo", scope = ConsultarEditalResultado.class)
    public JAXBElement<String> createConsultarEditalResultadoProtocolo(String value) {
        return new JAXBElement<String>(_ConsultarEditalEnviadoProtocolo_QNAME, String.class, ConsultarEditalResultado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarUltimoSequencialResult", scope = ConsultarUltimoSequencialResponse.class)
    public JAXBElement<String> createConsultarUltimoSequencialResponseConsultarUltimoSequencialResult(String value) {
        return new JAXBElement<String>(_ConsultarUltimoSequencialResponseConsultarUltimoSequencialResult_QNAME, String.class, ConsultarUltimoSequencialResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarUnidadesMedidaResult", scope = ConsultarUnidadesMedidaResponse.class)
    public JAXBElement<String> createConsultarUnidadesMedidaResponseConsultarUnidadesMedidaResult(String value) {
        return new JAXBElement<String>(_ConsultarUnidadesMedidaResponseConsultarUnidadesMedidaResult_QNAME, String.class, ConsultarUnidadesMedidaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pesquisa", scope = ConsultarProdutosPaginado.class)
    public JAXBElement<String> createConsultarProdutosPaginadoPesquisa(String value) {
        return new JAXBElement<String>(_ConsultarProdutosPaginadoPesquisa_QNAME, String.class, ConsultarProdutosPaginado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "expressaoOrdenamento", scope = ConsultarProdutosPaginado.class)
    public JAXBElement<String> createConsultarProdutosPaginadoExpressaoOrdenamento(String value) {
        return new JAXBElement<String>(_ConsultarProdutosPaginadoExpressaoOrdenamento_QNAME, String.class, ConsultarProdutosPaginado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarProdutosPaginadoResult", scope = ConsultarProdutosPaginadoResponse.class)
    public JAXBElement<String> createConsultarProdutosPaginadoResponseConsultarProdutosPaginadoResult(String value) {
        return new JAXBElement<String>(_ConsultarProdutosPaginadoResponseConsultarProdutosPaginadoResult_QNAME, String.class, ConsultarProdutosPaginadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarEditalResultadoResult", scope = ConsultarEditalResultadoResponse.class)
    public JAXBElement<String> createConsultarEditalResultadoResponseConsultarEditalResultadoResult(String value) {
        return new JAXBElement<String>(_ConsultarEditalResultadoResponseConsultarEditalResultadoResult_QNAME, String.class, ConsultarEditalResultadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EnviarEditalResult", scope = EnviarEditalResponse.class)
    public JAXBElement<String> createEnviarEditalResponseEnviarEditalResult(String value) {
        return new JAXBElement<String>(_EnviarEditalResponseEnviarEditalResult_QNAME, String.class, EnviarEditalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarEditalEnviadoResult", scope = ConsultarEditalEnviadoResponse.class)
    public JAXBElement<String> createConsultarEditalEnviadoResponseConsultarEditalEnviadoResult(String value) {
        return new JAXBElement<String>(_ConsultarEditalEnviadoResponseConsultarEditalEnviadoResult_QNAME, String.class, ConsultarEditalEnviadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "editalXml", scope = EnviarEdital.class)
    public JAXBElement<String> createEnviarEditalEditalXml(String value) {
        return new JAXBElement<String>(_EnviarEditalEditalXml_QNAME, String.class, EnviarEdital.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarEditalResult", scope = ConsultarEditalResponse.class)
    public JAXBElement<String> createConsultarEditalResponseConsultarEditalResult(String value) {
        return new JAXBElement<String>(_ConsultarEditalResponseConsultarEditalResult_QNAME, String.class, ConsultarEditalResponse.class, value);
    }

}
