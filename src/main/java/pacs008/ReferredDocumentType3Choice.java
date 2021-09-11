
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the type of the document referred in the remittance information.
 * 
 * <p>ReferredDocumentType3Choice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReferredDocumentType3Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}DocumentType6Code"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredDocumentType3Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "cd",
    "prtry"
})
public class ReferredDocumentType3Choice {

    @XmlElement(name = "Cd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "string")
    protected DocumentType6Code cd;
    @XmlElement(name = "Prtry", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String prtry;

    /**
     * 获取cd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocumentType6Code }
     *     
     */
    public DocumentType6Code getCd() {
        return cd;
    }

    /**
     * 设置cd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType6Code }
     *     
     */
    public void setCd(DocumentType6Code value) {
        this.cd = value;
    }

    /**
     * 获取prtry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * 设置prtry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtry(String value) {
        this.prtry = value;
    }

}
