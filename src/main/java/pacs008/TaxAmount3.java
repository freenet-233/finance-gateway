
package pacs008;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of elements used to provide information on the tax amount(s) of tax record.
 * 
 * <p>TaxAmount3 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaxAmount3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PercentageRate" minOccurs="0"/>
 *         &lt;element name="TaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="Dtls" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TaxRecordDetails3" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAmount3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "rate",
    "taxblBaseAmt",
    "ttlAmt",
    "dtls"
})
public class TaxAmount3 {

    @XmlElement(name = "Rate", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BigDecimal rate;
    @XmlElement(name = "TaxblBaseAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected ActiveOrHistoricCurrencyAndAmount taxblBaseAmt;
    @XmlElement(name = "TtlAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected ActiveOrHistoricCurrencyAndAmount ttlAmt;
    @XmlElement(name = "Dtls", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<TaxRecordDetails3> dtls;

    /**
     * 获取rate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置rate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * 获取taxblBaseAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTaxblBaseAmt() {
        return taxblBaseAmt;
    }

    /**
     * 设置taxblBaseAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.taxblBaseAmt = value;
    }

    /**
     * 获取ttlAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * 设置ttlAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRecordDetails3 }
     * 
     * 
     */
    public List<TaxRecordDetails3> getDtls() {
        if (dtls == null) {
            dtls = new ArrayList<TaxRecordDetails3>();
        }
        return this.dtls;
    }

}
