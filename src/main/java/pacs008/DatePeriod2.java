
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Range of time defined by a start date and an end date.
 * 
 * <p>DatePeriod2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DatePeriod2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISODate"/>
 *         &lt;element name="ToDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISODate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatePeriod2", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "frDt",
    "toDt"
})
public class DatePeriod2 {

    @XmlElement(name = "FrDt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frDt;
    @XmlElement(name = "ToDt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDt;

    /**
     * 获取frDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrDt() {
        return frDt;
    }

    /**
     * 设置frDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrDt(XMLGregorianCalendar value) {
        this.frDt = value;
    }

    /**
     * 获取toDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDt() {
        return toDt;
    }

    /**
     * 设置toDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDt(XMLGregorianCalendar value) {
        this.toDt = value;
    }

}
