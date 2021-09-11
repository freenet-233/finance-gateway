
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional information that can not be captured in the structured fields and/or any other specific block.
 * 
 * <p>SupplementaryData1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplementaryData1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlcAndNm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max350Text" minOccurs="0"/>
 *         &lt;element name="Envlp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}SupplementaryDataEnvelope1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryData1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "plcAndNm",
    "envlp"
})
public class SupplementaryData1 {

    @XmlElement(name = "PlcAndNm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String plcAndNm;
    @XmlElement(name = "Envlp", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected SupplementaryDataEnvelope1 envlp;

    /**
     * 获取plcAndNm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * 设置plcAndNm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlcAndNm(String value) {
        this.plcAndNm = value;
    }

    /**
     * 获取envlp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryDataEnvelope1 }
     *     
     */
    public SupplementaryDataEnvelope1 getEnvlp() {
        return envlp;
    }

    /**
     * 设置envlp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryDataEnvelope1 }
     *     
     */
    public void setEnvlp(SupplementaryDataEnvelope1 value) {
        this.envlp = value;
    }

}
