
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the type of the document line identification.
 * 
 * <p>DocumentLineType1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocumentLineType1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CdOrPrtry" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}DocumentLineType1Choice"/>
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentLineType1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "cdOrPrtry",
    "issr"
})
public class DocumentLineType1 {

    @XmlElement(name = "CdOrPrtry", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected DocumentLineType1Choice cdOrPrtry;
    @XmlElement(name = "Issr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String issr;

    /**
     * 获取cdOrPrtry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocumentLineType1Choice }
     *     
     */
    public DocumentLineType1Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * 设置cdOrPrtry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentLineType1Choice }
     *     
     */
    public void setCdOrPrtry(DocumentLineType1Choice value) {
        this.cdOrPrtry = value;
    }

    /**
     * 获取issr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * 设置issr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

}
