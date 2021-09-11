
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Provides remittance information about a payment for garnishment-related purposes.
 * 
 * <p>Garnishment3 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Garnishment3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}GarnishmentType1"/>
 *         &lt;element name="Grnshee" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PartyIdentification135" minOccurs="0"/>
 *         &lt;element name="GrnshmtAdmstr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PartyIdentification135" minOccurs="0"/>
 *         &lt;element name="RefNb" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max140Text" minOccurs="0"/>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISODate" minOccurs="0"/>
 *         &lt;element name="RmtdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="FmlyMdclInsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="MplyeeTermntnInd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TrueFalseIndicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Garnishment3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "tp",
    "grnshee",
    "grnshmtAdmstr",
    "refNb",
    "dt",
    "rmtdAmt",
    "fmlyMdclInsrncInd",
    "mplyeeTermntnInd"
})
public class Garnishment3 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected GarnishmentType1 tp;
    @XmlElement(name = "Grnshee", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected PartyIdentification135 grnshee;
    @XmlElement(name = "GrnshmtAdmstr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected PartyIdentification135 grnshmtAdmstr;
    @XmlElement(name = "RefNb", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String refNb;
    @XmlElement(name = "Dt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "RmtdAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected ActiveOrHistoricCurrencyAndAmount rmtdAmt;
    @XmlElement(name = "FmlyMdclInsrncInd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected Boolean fmlyMdclInsrncInd;
    @XmlElement(name = "MplyeeTermntnInd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected Boolean mplyeeTermntnInd;

    /**
     * 获取tp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GarnishmentType1 }
     *     
     */
    public GarnishmentType1 getTp() {
        return tp;
    }

    /**
     * 设置tp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GarnishmentType1 }
     *     
     */
    public void setTp(GarnishmentType1 value) {
        this.tp = value;
    }

    /**
     * 获取grnshee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getGrnshee() {
        return grnshee;
    }

    /**
     * 设置grnshee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setGrnshee(PartyIdentification135 value) {
        this.grnshee = value;
    }

    /**
     * 获取grnshmtAdmstr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getGrnshmtAdmstr() {
        return grnshmtAdmstr;
    }

    /**
     * 设置grnshmtAdmstr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setGrnshmtAdmstr(PartyIdentification135 value) {
        this.grnshmtAdmstr = value;
    }

    /**
     * 获取refNb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNb() {
        return refNb;
    }

    /**
     * 设置refNb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNb(String value) {
        this.refNb = value;
    }

    /**
     * 获取dt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * 设置dt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * 获取rmtdAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRmtdAmt() {
        return rmtdAmt;
    }

    /**
     * 设置rmtdAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setRmtdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rmtdAmt = value;
    }

    /**
     * 获取fmlyMdclInsrncInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFmlyMdclInsrncInd() {
        return fmlyMdclInsrncInd;
    }

    /**
     * 设置fmlyMdclInsrncInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFmlyMdclInsrncInd(Boolean value) {
        this.fmlyMdclInsrncInd = value;
    }

    /**
     * 获取mplyeeTermntnInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMplyeeTermntnInd() {
        return mplyeeTermntnInd;
    }

    /**
     * 设置mplyeeTermntnInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMplyeeTermntnInd(Boolean value) {
        this.mplyeeTermntnInd = value;
    }

}
