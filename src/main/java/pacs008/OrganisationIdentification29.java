
package pacs008;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Unique and unambiguous way to identify an organisation.
 * 
 * <p>OrganisationIdentification29 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrganisationIdentification29">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnyBIC" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}AnyBICDec2014Identifier" minOccurs="0"/>
 *         &lt;element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}LEIIdentifier" minOccurs="0"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}GenericOrganisationIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification29", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "anyBIC",
    "lei",
    "othr"
})
public class OrganisationIdentification29 {

    @XmlElement(name = "AnyBIC", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String anyBIC;
    @XmlElement(name = "LEI", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String lei;
    @XmlElement(name = "Othr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<GenericOrganisationIdentification1> othr;

    /**
     * 获取anyBIC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyBIC() {
        return anyBIC;
    }

    /**
     * 设置anyBIC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyBIC(String value) {
        this.anyBIC = value;
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
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericOrganisationIdentification1 }
     * 
     * 
     */
    public List<GenericOrganisationIdentification1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<GenericOrganisationIdentification1>();
        }
        return this.othr;
    }

}
