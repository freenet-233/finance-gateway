
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Provides information on the requested settlement time(s) of the payment instruction.
 * 
 * <p>SettlementTimeRequest2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SettlementTimeRequest2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLSTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISOTime" minOccurs="0"/>
 *         &lt;element name="TillTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISOTime" minOccurs="0"/>
 *         &lt;element name="FrTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISOTime" minOccurs="0"/>
 *         &lt;element name="RjctTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISOTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTimeRequest2", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "clsTm",
    "tillTm",
    "frTm",
    "rjctTm"
})
public class SettlementTimeRequest2 {

    @XmlElement(name = "CLSTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar clsTm;
    @XmlElement(name = "TillTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tillTm;
    @XmlElement(name = "FrTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar frTm;
    @XmlElement(name = "RjctTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar rjctTm;

    /**
     * 获取clsTm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLSTm() {
        return clsTm;
    }

    /**
     * 设置clsTm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLSTm(XMLGregorianCalendar value) {
        this.clsTm = value;
    }

    /**
     * 获取tillTm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTillTm() {
        return tillTm;
    }

    /**
     * 设置tillTm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTillTm(XMLGregorianCalendar value) {
        this.tillTm = value;
    }

    /**
     * 获取frTm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrTm() {
        return frTm;
    }

    /**
     * 设置frTm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrTm(XMLGregorianCalendar value) {
        this.frTm = value;
    }

    /**
     * 获取rjctTm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRjctTm() {
        return rjctTm;
    }

    /**
     * 设置rjctTm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRjctTm(XMLGregorianCalendar value) {
        this.rjctTm = value;
    }

}
