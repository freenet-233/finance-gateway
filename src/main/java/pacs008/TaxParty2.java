
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about the entity involved in the tax paid or to be paid.
 * 
 * <p>TaxParty2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaxParty2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="RegnId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="TaxTp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="Authstn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TaxAuthorisation1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxParty2", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "taxId",
    "regnId",
    "taxTp",
    "authstn"
})
public class TaxParty2 {

    @XmlElement(name = "TaxId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String taxId;
    @XmlElement(name = "RegnId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String regnId;
    @XmlElement(name = "TaxTp", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String taxTp;
    @XmlElement(name = "Authstn", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected TaxAuthorisation1 authstn;

    /**
     * 获取taxId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * 设置taxId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * 获取regnId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnId() {
        return regnId;
    }

    /**
     * 设置regnId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnId(String value) {
        this.regnId = value;
    }

    /**
     * 获取taxTp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTp() {
        return taxTp;
    }

    /**
     * 设置taxTp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTp(String value) {
        this.taxTp = value;
    }

    /**
     * 获取authstn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxAuthorisation1 }
     *     
     */
    public TaxAuthorisation1 getAuthstn() {
        return authstn;
    }

    /**
     * 设置authstn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAuthorisation1 }
     *     
     */
    public void setAuthstn(TaxAuthorisation1 value) {
        this.authstn = value;
    }

}
