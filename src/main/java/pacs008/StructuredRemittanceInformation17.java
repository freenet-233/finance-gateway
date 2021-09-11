
package pacs008;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.
 * 
 * <p>StructuredRemittanceInformation17 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StructuredRemittanceInformation17">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RfrdDocInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ReferredDocumentInformation7" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RfrdDocAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}RemittanceAmount2" minOccurs="0"/>
 *         &lt;element name="CdtrRefInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CreditorReferenceInformation2" minOccurs="0"/>
 *         &lt;element name="Invcr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PartyIdentification135" minOccurs="0"/>
 *         &lt;element name="Invcee" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PartyIdentification135" minOccurs="0"/>
 *         &lt;element name="TaxRmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TaxData1" minOccurs="0"/>
 *         &lt;element name="GrnshmtRmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Garnishment3" minOccurs="0"/>
 *         &lt;element name="AddtlRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max140Text" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation17", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "rfrdDocInf",
    "rfrdDocAmt",
    "cdtrRefInf",
    "invcr",
    "invcee",
    "taxRmt",
    "grnshmtRmt",
    "addtlRmtInf"
})
public class StructuredRemittanceInformation17 {

    @XmlElement(name = "RfrdDocInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<ReferredDocumentInformation7> rfrdDocInf;
    @XmlElement(name = "RfrdDocAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected RemittanceAmount2 rfrdDocAmt;
    @XmlElement(name = "CdtrRefInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CreditorReferenceInformation2 cdtrRefInf;
    @XmlElement(name = "Invcr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected PartyIdentification135 invcr;
    @XmlElement(name = "Invcee", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected PartyIdentification135 invcee;
    @XmlElement(name = "TaxRmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected TaxData1 taxRmt;
    @XmlElement(name = "GrnshmtRmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected Garnishment3 grnshmtRmt;
    @XmlElement(name = "AddtlRmtInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<String> addtlRmtInf;

    /**
     * Gets the value of the rfrdDocInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfrdDocInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDocInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredDocumentInformation7 }
     * 
     * 
     */
    public List<ReferredDocumentInformation7> getRfrdDocInf() {
        if (rfrdDocInf == null) {
            rfrdDocInf = new ArrayList<ReferredDocumentInformation7>();
        }
        return this.rfrdDocInf;
    }

    /**
     * 获取rfrdDocAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RemittanceAmount2 }
     *     
     */
    public RemittanceAmount2 getRfrdDocAmt() {
        return rfrdDocAmt;
    }

    /**
     * 设置rfrdDocAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceAmount2 }
     *     
     */
    public void setRfrdDocAmt(RemittanceAmount2 value) {
        this.rfrdDocAmt = value;
    }

    /**
     * 获取cdtrRefInf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public CreditorReferenceInformation2 getCdtrRefInf() {
        return cdtrRefInf;
    }

    /**
     * 设置cdtrRefInf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public void setCdtrRefInf(CreditorReferenceInformation2 value) {
        this.cdtrRefInf = value;
    }

    /**
     * 获取invcr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getInvcr() {
        return invcr;
    }

    /**
     * 设置invcr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setInvcr(PartyIdentification135 value) {
        this.invcr = value;
    }

    /**
     * 获取invcee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getInvcee() {
        return invcee;
    }

    /**
     * 设置invcee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setInvcee(PartyIdentification135 value) {
        this.invcee = value;
    }

    /**
     * 获取taxRmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxData1 }
     *     
     */
    public TaxData1 getTaxRmt() {
        return taxRmt;
    }

    /**
     * 设置taxRmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxData1 }
     *     
     */
    public void setTaxRmt(TaxData1 value) {
        this.taxRmt = value;
    }

    /**
     * 获取grnshmtRmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Garnishment3 }
     *     
     */
    public Garnishment3 getGrnshmtRmt() {
        return grnshmtRmt;
    }

    /**
     * 设置grnshmtRmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Garnishment3 }
     *     
     */
    public void setGrnshmtRmt(Garnishment3 value) {
        this.grnshmtRmt = value;
    }

    /**
     * Gets the value of the addtlRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlRmtInf() {
        if (addtlRmtInf == null) {
            addtlRmtInf = new ArrayList<String>();
        }
        return this.addtlRmtInf;
    }

}
