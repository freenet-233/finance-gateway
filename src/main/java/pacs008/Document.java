
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Document complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FIToFICstmrCdtTrf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}FIToFICustomerCreditTransferV10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "fiToFICstmrCdtTrf"
})
public class Document {

    @XmlElement(name = "FIToFICstmrCdtTrf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected FIToFICustomerCreditTransferV10 fiToFICstmrCdtTrf;

    /**
     * 获取fiToFICstmrCdtTrf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FIToFICustomerCreditTransferV10 }
     *     
     */
    public FIToFICustomerCreditTransferV10 getFIToFICstmrCdtTrf() {
        return fiToFICstmrCdtTrf;
    }

    /**
     * 设置fiToFICstmrCdtTrf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FIToFICustomerCreditTransferV10 }
     *     
     */
    public void setFIToFICstmrCdtTrf(FIToFICustomerCreditTransferV10 value) {
        this.fiToFICstmrCdtTrf = value;
    }

}
