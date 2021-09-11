
package pacs008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Nature or use of the account.
 * 
 * <p>Party38Choice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Party38Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}OrganisationIdentification29"/>
 *         &lt;element name="PrvtId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PersonIdentification13"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party38Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "orgId",
    "prvtId"
})
public class Party38Choice {

    @XmlElement(name = "OrgId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected OrganisationIdentification29 orgId;
    @XmlElement(name = "PrvtId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected PersonIdentification13 prvtId;

    /**
     * 获取orgId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public OrganisationIdentification29 getOrgId() {
        return orgId;
    }

    /**
     * 设置orgId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public void setOrgId(OrganisationIdentification29 value) {
        this.orgId = value;
    }

    /**
     * 获取prvtId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification13 }
     *     
     */
    public PersonIdentification13 getPrvtId() {
        return prvtId;
    }

    /**
     * 设置prvtId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification13 }
     *     
     */
    public void setPrvtId(PersonIdentification13 value) {
        this.prvtId = value;
    }

}
