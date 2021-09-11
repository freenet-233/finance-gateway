
package pacs008;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system.
 * 
 * <p>RemittanceInformation21 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RemittanceInformation21">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ustrd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max140Text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Strd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}StructuredRemittanceInformation17" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceInformation21", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "ustrd",
    "strd"
})
public class RemittanceInformation21 {

    @XmlElement(name = "Ustrd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<String> ustrd;
    @XmlElement(name = "Strd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<StructuredRemittanceInformation17> strd;

    /**
     * Gets the value of the ustrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ustrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUstrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUstrd() {
        if (ustrd == null) {
            ustrd = new ArrayList<String>();
        }
        return this.ustrd;
    }

    /**
     * Gets the value of the strd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredRemittanceInformation17 }
     * 
     * 
     */
    public List<StructuredRemittanceInformation17> getStrd() {
        if (strd == null) {
            strd = new ArrayList<StructuredRemittanceInformation17>();
        }
        return this.strd;
    }

}
