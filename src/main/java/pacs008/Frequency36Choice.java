
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Choice of format for a frequency, for example, the frequency of payment.
 * 
 * <p>Frequency36Choice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Frequency36Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Frequency6Code"/>
 *         &lt;element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}FrequencyPeriod1"/>
 *         &lt;element name="PtInTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}FrequencyAndMoment1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Frequency36Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "tp",
    "prd",
    "ptInTm"
})
public class Frequency36Choice {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "string")
    protected Frequency6Code tp;
    @XmlElement(name = "Prd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected FrequencyPeriod1 prd;
    @XmlElement(name = "PtInTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected FrequencyAndMoment1 ptInTm;

    /**
     * 获取tp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Frequency6Code }
     *     
     */
    public Frequency6Code getTp() {
        return tp;
    }

    /**
     * 设置tp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency6Code }
     *     
     */
    public void setTp(Frequency6Code value) {
        this.tp = value;
    }

    /**
     * 获取prd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyPeriod1 }
     *     
     */
    public FrequencyPeriod1 getPrd() {
        return prd;
    }

    /**
     * 设置prd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyPeriod1 }
     *     
     */
    public void setPrd(FrequencyPeriod1 value) {
        this.prd = value;
    }

    /**
     * 获取ptInTm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyAndMoment1 }
     *     
     */
    public FrequencyAndMoment1 getPtInTm() {
        return ptInTm;
    }

    /**
     * 设置ptInTm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyAndMoment1 }
     *     
     */
    public void setPtInTm(FrequencyAndMoment1 value) {
        this.ptInTm = value;
    }

}
