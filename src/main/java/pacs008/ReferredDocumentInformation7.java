
package pacs008;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Set of elements used to identify the documents referred to in the remittance information.
 * 
 * <p>ReferredDocumentInformation7 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReferredDocumentInformation7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ReferredDocumentType4" minOccurs="0"/>
 *         &lt;element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="RltdDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISODate" minOccurs="0"/>
 *         &lt;element name="LineDtls" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}DocumentLineInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredDocumentInformation7", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "tp",
    "nb",
    "rltdDt",
    "lineDtls"
})
public class ReferredDocumentInformation7 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected ReferredDocumentType4 tp;
    @XmlElement(name = "Nb", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String nb;
    @XmlElement(name = "RltdDt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rltdDt;
    @XmlElement(name = "LineDtls", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<DocumentLineInformation1> lineDtls;

    /**
     * 获取tp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReferredDocumentType4 }
     *     
     */
    public ReferredDocumentType4 getTp() {
        return tp;
    }

    /**
     * 设置tp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredDocumentType4 }
     *     
     */
    public void setTp(ReferredDocumentType4 value) {
        this.tp = value;
    }

    /**
     * 获取nb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * 设置nb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNb(String value) {
        this.nb = value;
    }

    /**
     * 获取rltdDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRltdDt() {
        return rltdDt;
    }

    /**
     * 设置rltdDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRltdDt(XMLGregorianCalendar value) {
        this.rltdDt = value;
    }

    /**
     * Gets the value of the lineDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentLineInformation1 }
     * 
     * 
     */
    public List<DocumentLineInformation1> getLineDtls() {
        if (lineDtls == null) {
            lineDtls = new ArrayList<DocumentLineInformation1>();
        }
        return this.lineDtls;
    }

}
