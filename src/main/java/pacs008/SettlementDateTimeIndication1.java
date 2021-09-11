
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information on the occurred settlement time(s) of the payment transaction.
 * 
 * <p>SettlementDateTimeIndication1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SettlementDateTimeIndication1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DbtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISODateTime" minOccurs="0"/>
 *         &lt;element name="CdtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISODateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDateTimeIndication1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "dbtDtTm",
    "cdtDtTm"
})
public class SettlementDateTimeIndication1 {

    @XmlElement(name = "DbtDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dbtDtTm;
    @XmlElement(name = "CdtDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cdtDtTm;

    /**
     * 获取dbtDtTm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDbtDtTm() {
        return dbtDtTm;
    }

    /**
     * 设置dbtDtTm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDbtDtTm(XMLGregorianCalendar value) {
        this.dbtDtTm = value;
    }

    /**
     * 获取cdtDtTm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCdtDtTm() {
        return cdtDtTm;
    }

    /**
     * 设置cdtDtTm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCdtDtTm(XMLGregorianCalendar value) {
        this.cdtDtTm = value;
    }

}
