
package pacs008;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Details about tax paid, or to be paid, to the government in accordance with the law, including pre-defined parameters such as thresholds and type of account.
 * 
 * <p>TaxData1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaxData1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TaxParty1" minOccurs="0"/>
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TaxParty2" minOccurs="0"/>
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TaxParty2" minOccurs="0"/>
 *         &lt;element name="AdmstnZone" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="RefNb" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max140Text" minOccurs="0"/>
 *         &lt;element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="TtlTaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="TtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISODate" minOccurs="0"/>
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Number" minOccurs="0"/>
 *         &lt;element name="Rcrd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TaxRecord3" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxData1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "cdtr",
    "dbtr",
    "ultmtDbtr",
    "admstnZone",
    "refNb",
    "mtd",
    "ttlTaxblBaseAmt",
    "ttlTaxAmt",
    "dt",
    "seqNb",
    "rcrd"
})
public class TaxData1 {

    @XmlElement(name = "Cdtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected TaxParty1 cdtr;
    @XmlElement(name = "Dbtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected TaxParty2 dbtr;
    @XmlElement(name = "UltmtDbtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected TaxParty2 ultmtDbtr;
    @XmlElement(name = "AdmstnZone", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String admstnZone;
    @XmlElement(name = "RefNb", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String refNb;
    @XmlElement(name = "Mtd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String mtd;
    @XmlElement(name = "TtlTaxblBaseAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected ActiveOrHistoricCurrencyAndAmount ttlTaxblBaseAmt;
    @XmlElement(name = "TtlTaxAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected ActiveOrHistoricCurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "Dt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "SeqNb", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BigDecimal seqNb;
    @XmlElement(name = "Rcrd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<TaxRecord3> rcrd;

    /**
     * 获取cdtr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxParty1 }
     *     
     */
    public TaxParty1 getCdtr() {
        return cdtr;
    }

    /**
     * 设置cdtr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxParty1 }
     *     
     */
    public void setCdtr(TaxParty1 value) {
        this.cdtr = value;
    }

    /**
     * 获取dbtr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxParty2 }
     *     
     */
    public TaxParty2 getDbtr() {
        return dbtr;
    }

    /**
     * 设置dbtr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxParty2 }
     *     
     */
    public void setDbtr(TaxParty2 value) {
        this.dbtr = value;
    }

    /**
     * 获取ultmtDbtr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxParty2 }
     *     
     */
    public TaxParty2 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * 设置ultmtDbtr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxParty2 }
     *     
     */
    public void setUltmtDbtr(TaxParty2 value) {
        this.ultmtDbtr = value;
    }

    /**
     * 获取admstnZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmstnZone() {
        return admstnZone;
    }

    /**
     * 设置admstnZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmstnZone(String value) {
        this.admstnZone = value;
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
     * 获取mtd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtd() {
        return mtd;
    }

    /**
     * 设置mtd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtd(String value) {
        this.mtd = value;
    }

    /**
     * 获取ttlTaxblBaseAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlTaxblBaseAmt() {
        return ttlTaxblBaseAmt;
    }

    /**
     * 设置ttlTaxblBaseAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxblBaseAmt = value;
    }

    /**
     * 获取ttlTaxAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    /**
     * 设置ttlTaxAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlTaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxAmt = value;
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
     * 获取seqNb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * 设置seqNb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the rcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRecord3 }
     * 
     * 
     */
    public List<TaxRecord3> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<TaxRecord3>();
        }
        return this.rcrd;
    }

}
