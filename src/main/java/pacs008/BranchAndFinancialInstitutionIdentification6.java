
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Unique and unambiguous identification of a financial institution or a branch of a financial institution.
 * 
 * <p>BranchAndFinancialInstitutionIdentification6 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BranchAndFinancialInstitutionIdentification6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}FinancialInstitutionIdentification18"/>
 *         &lt;element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BranchData3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification6", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "finInstnId",
    "brnchId"
})
public class BranchAndFinancialInstitutionIdentification6 {

    @XmlElement(name = "FinInstnId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected FinancialInstitutionIdentification18 finInstnId;
    @XmlElement(name = "BrnchId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BranchData3 brnchId;

    /**
     * 获取finInstnId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification18 }
     *     
     */
    public FinancialInstitutionIdentification18 getFinInstnId() {
        return finInstnId;
    }

    /**
     * 设置finInstnId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification18 }
     *     
     */
    public void setFinInstnId(FinancialInstitutionIdentification18 value) {
        this.finInstnId = value;
    }

    /**
     * 获取brnchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchData3 }
     *     
     */
    public BranchData3 getBrnchId() {
        return brnchId;
    }

    /**
     * 设置brnchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData3 }
     *     
     */
    public void setBrnchId(BranchData3 value) {
        this.brnchId = value;
    }

}
