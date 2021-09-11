
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of elements used to define the tax record.
 * 
 * <p>TaxRecord3 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaxRecord3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="Ctgy" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="CtgyDtls" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="DbtrSts" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="CertId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="FrmsCd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TaxPeriod3" minOccurs="0"/>
 *         &lt;element name="TaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TaxAmount3" minOccurs="0"/>
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max140Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRecord3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "tp",
    "ctgy",
    "ctgyDtls",
    "dbtrSts",
    "certId",
    "frmsCd",
    "prd",
    "taxAmt",
    "addtlInf"
})
public class TaxRecord3 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String tp;
    @XmlElement(name = "Ctgy", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String ctgy;
    @XmlElement(name = "CtgyDtls", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String ctgyDtls;
    @XmlElement(name = "DbtrSts", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String dbtrSts;
    @XmlElement(name = "CertId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String certId;
    @XmlElement(name = "FrmsCd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String frmsCd;
    @XmlElement(name = "Prd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected TaxPeriod3 prd;
    @XmlElement(name = "TaxAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected TaxAmount3 taxAmt;
    @XmlElement(name = "AddtlInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String addtlInf;

    /**
     * 获取tp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * 设置tp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * 获取ctgy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgy() {
        return ctgy;
    }

    /**
     * 设置ctgy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgy(String value) {
        this.ctgy = value;
    }

    /**
     * 获取ctgyDtls属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgyDtls() {
        return ctgyDtls;
    }

    /**
     * 设置ctgyDtls属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgyDtls(String value) {
        this.ctgyDtls = value;
    }

    /**
     * 获取dbtrSts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrSts() {
        return dbtrSts;
    }

    /**
     * 设置dbtrSts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtrSts(String value) {
        this.dbtrSts = value;
    }

    /**
     * 获取certId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * 设置certId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertId(String value) {
        this.certId = value;
    }

    /**
     * 获取frmsCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmsCd() {
        return frmsCd;
    }

    /**
     * 设置frmsCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmsCd(String value) {
        this.frmsCd = value;
    }

    /**
     * 获取prd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxPeriod3 }
     *     
     */
    public TaxPeriod3 getPrd() {
        return prd;
    }

    /**
     * 设置prd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPeriod3 }
     *     
     */
    public void setPrd(TaxPeriod3 value) {
        this.prd = value;
    }

    /**
     * 获取taxAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxAmount3 }
     *     
     */
    public TaxAmount3 getTaxAmt() {
        return taxAmt;
    }

    /**
     * 设置taxAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmount3 }
     *     
     */
    public void setTaxAmt(TaxAmount3 value) {
        this.taxAmt = value;
    }

    /**
     * 获取addtlInf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * 设置addtlInf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
