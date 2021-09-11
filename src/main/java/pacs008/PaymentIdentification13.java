
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides further means of referencing a payment transaction.
 * 
 * <p>PaymentIdentification13 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentIdentification13">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="EndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text"/>
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="UETR" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}UUIDv4Identifier" minOccurs="0"/>
 *         &lt;element name="ClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentIdentification13", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "instrId",
    "endToEndId",
    "txId",
    "uetr",
    "clrSysRef"
})
public class PaymentIdentification13 {

    @XmlElement(name = "InstrId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String instrId;
    @XmlElement(name = "EndToEndId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected String endToEndId;
    @XmlElement(name = "TxId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String txId;
    @XmlElement(name = "UETR", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String uetr;
    @XmlElement(name = "ClrSysRef", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String clrSysRef;

    /**
     * 获取instrId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * 设置instrId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * 获取endToEndId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * 设置endToEndId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndToEndId(String value) {
        this.endToEndId = value;
    }

    /**
     * 获取txId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * 设置txId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * 获取uetr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUETR() {
        return uetr;
    }

    /**
     * 设置uetr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUETR(String value) {
        this.uetr = value;
    }

    /**
     * 获取clrSysRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrSysRef() {
        return clrSysRef;
    }

    /**
     * 设置clrSysRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrSysRef(String value) {
        this.clrSysRef = value;
    }

}
