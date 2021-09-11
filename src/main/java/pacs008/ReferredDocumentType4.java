
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the type of the document referred in the remittance information.
 * 
 * <p>ReferredDocumentType4 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReferredDocumentType4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CdOrPrtry" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ReferredDocumentType3Choice"/>
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredDocumentType4", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "cdOrPrtry",
    "issr"
})
public class ReferredDocumentType4 {

    @XmlElement(name = "CdOrPrtry", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected ReferredDocumentType3Choice cdOrPrtry;
    @XmlElement(name = "Issr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String issr;

    /**
     * 获取cdOrPrtry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReferredDocumentType3Choice }
     *     
     */
    public ReferredDocumentType3Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * 设置cdOrPrtry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredDocumentType3Choice }
     *     
     */
    public void setCdOrPrtry(ReferredDocumentType3Choice value) {
        this.cdOrPrtry = value;
    }

    /**
     * 获取issr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * 设置issr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

}
