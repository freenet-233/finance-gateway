
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides information on the individual tax amount(s) per period of the tax record.
 * 
 * <p>TaxRecordDetails3 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaxRecordDetails3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TaxPeriod3" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ActiveOrHistoricCurrencyAndAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRecordDetails3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "prd",
    "amt"
})
public class TaxRecordDetails3 {

    @XmlElement(name = "Prd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected TaxPeriod3 prd;
    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;

    /**
     * 获取prd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxPeriod3 }
     *     
     */
    public TaxPeriod3 getPrd() {
        return prd;
    }

    /**
     * 设置prd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPeriod3 }
     *     
     */
    public void setPrd(TaxPeriod3 value) {
        this.prd = value;
    }

    /**
     * 获取amt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * 设置amt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

}
