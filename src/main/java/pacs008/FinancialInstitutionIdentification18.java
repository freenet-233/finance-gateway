
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the details to identify a financial institution.
 * 
 * <p>FinancialInstitutionIdentification18 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FinancialInstitutionIdentification18">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BICFI" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BICFIDec2014Identifier" minOccurs="0"/>
 *         &lt;element name="ClrSysMmbId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ClearingSystemMemberIdentification2" minOccurs="0"/>
 *         &lt;element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}LEIIdentifier" minOccurs="0"/>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max140Text" minOccurs="0"/>
 *         &lt;element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PostalAddress24" minOccurs="0"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}GenericFinancialIdentification1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionIdentification18", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "bicfi",
    "clrSysMmbId",
    "lei",
    "nm",
    "pstlAdr",
    "othr"
})
public class FinancialInstitutionIdentification18 {

    @XmlElement(name = "BICFI", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String bicfi;
    @XmlElement(name = "ClrSysMmbId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected ClearingSystemMemberIdentification2 clrSysMmbId;
    @XmlElement(name = "LEI", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String lei;
    @XmlElement(name = "Nm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String nm;
    @XmlElement(name = "PstlAdr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected PostalAddress24 pstlAdr;
    @XmlElement(name = "Othr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected GenericFinancialIdentification1 othr;

    /**
     * 获取bicfi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICFI() {
        return bicfi;
    }

    /**
     * 设置bicfi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICFI(String value) {
        this.bicfi = value;
    }

    /**
     * 获取clrSysMmbId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemMemberIdentification2 }
     *     
     */
    public ClearingSystemMemberIdentification2 getClrSysMmbId() {
        return clrSysMmbId;
    }

    /**
     * 设置clrSysMmbId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemMemberIdentification2 }
     *     
     */
    public void setClrSysMmbId(ClearingSystemMemberIdentification2 value) {
        this.clrSysMmbId = value;
    }

    /**
     * 获取lei属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * 设置lei属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * 获取nm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * 设置nm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * 获取pstlAdr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress24 }
     *     
     */
    public PostalAddress24 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * 设置pstlAdr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress24 }
     *     
     */
    public void setPstlAdr(PostalAddress24 value) {
        this.pstlAdr = value;
    }

    /**
     * 获取othr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GenericFinancialIdentification1 }
     *     
     */
    public GenericFinancialIdentification1 getOthr() {
        return othr;
    }

    /**
     * 设置othr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GenericFinancialIdentification1 }
     *     
     */
    public void setOthr(GenericFinancialIdentification1 value) {
        this.othr = value;
    }

}
