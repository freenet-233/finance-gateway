
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Choice of formats for the type of address.
 * 
 * <p>AddressType3Choice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddressType3Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}AddressType2Code"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}GenericIdentification30"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType3Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "cd",
    "prtry"
})
public class AddressType3Choice {

    @XmlElement(name = "Cd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "string")
    protected AddressType2Code cd;
    @XmlElement(name = "Prtry", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected GenericIdentification30 prtry;

    /**
     * 获取cd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressType2Code }
     *     
     */
    public AddressType2Code getCd() {
        return cd;
    }

    /**
     * 设置cd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType2Code }
     *     
     */
    public void setCd(AddressType2Code value) {
        this.cd = value;
    }

    /**
     * 获取prtry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtry() {
        return prtry;
    }

    /**
     * 设置prtry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setPrtry(GenericIdentification30 value) {
        this.prtry = value;
    }

}
