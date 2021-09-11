
package pacs008;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information that locates and identifies a specific address, as defined by postal services.
 * 
 * <p>PostalAddress24 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PostalAddress24">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdrTp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}AddressType3Choice" minOccurs="0"/>
 *         &lt;element name="Dept" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max70Text" minOccurs="0"/>
 *         &lt;element name="SubDept" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max70Text" minOccurs="0"/>
 *         &lt;element name="StrtNm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max70Text" minOccurs="0"/>
 *         &lt;element name="BldgNb" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max16Text" minOccurs="0"/>
 *         &lt;element name="BldgNm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="Flr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max70Text" minOccurs="0"/>
 *         &lt;element name="PstBx" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max16Text" minOccurs="0"/>
 *         &lt;element name="Room" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max70Text" minOccurs="0"/>
 *         &lt;element name="PstCd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max16Text" minOccurs="0"/>
 *         &lt;element name="TwnNm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="TwnLctnNm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="DstrctNm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="CtrySubDvsn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CountryCode" minOccurs="0"/>
 *         &lt;element name="AdrLine" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Max70Text" maxOccurs="7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress24", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "adrTp",
    "dept",
    "subDept",
    "strtNm",
    "bldgNb",
    "bldgNm",
    "flr",
    "pstBx",
    "room",
    "pstCd",
    "twnNm",
    "twnLctnNm",
    "dstrctNm",
    "ctrySubDvsn",
    "ctry",
    "adrLine"
})
public class PostalAddress24 {

    @XmlElement(name = "AdrTp", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected AddressType3Choice adrTp;
    @XmlElement(name = "Dept", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String dept;
    @XmlElement(name = "SubDept", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String subDept;
    @XmlElement(name = "StrtNm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String strtNm;
    @XmlElement(name = "BldgNb", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String bldgNb;
    @XmlElement(name = "BldgNm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String bldgNm;
    @XmlElement(name = "Flr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String flr;
    @XmlElement(name = "PstBx", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String pstBx;
    @XmlElement(name = "Room", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String room;
    @XmlElement(name = "PstCd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String pstCd;
    @XmlElement(name = "TwnNm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String twnNm;
    @XmlElement(name = "TwnLctnNm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String twnLctnNm;
    @XmlElement(name = "DstrctNm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String dstrctNm;
    @XmlElement(name = "CtrySubDvsn", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String ctrySubDvsn;
    @XmlElement(name = "Ctry", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected String ctry;
    @XmlElement(name = "AdrLine", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<String> adrLine;

    /**
     * 获取adrTp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressType3Choice }
     *     
     */
    public AddressType3Choice getAdrTp() {
        return adrTp;
    }

    /**
     * 设置adrTp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType3Choice }
     *     
     */
    public void setAdrTp(AddressType3Choice value) {
        this.adrTp = value;
    }

    /**
     * 获取dept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * 设置dept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * 获取subDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDept() {
        return subDept;
    }

    /**
     * 设置subDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDept(String value) {
        this.subDept = value;
    }

    /**
     * 获取strtNm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * 设置strtNm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    /**
     * 获取bldgNb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * 设置bldgNb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

    /**
     * 获取bldgNm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNm() {
        return bldgNm;
    }

    /**
     * 设置bldgNm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNm(String value) {
        this.bldgNm = value;
    }

    /**
     * 获取flr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlr() {
        return flr;
    }

    /**
     * 设置flr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlr(String value) {
        this.flr = value;
    }

    /**
     * 获取pstBx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstBx() {
        return pstBx;
    }

    /**
     * 设置pstBx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstBx(String value) {
        this.pstBx = value;
    }

    /**
     * 获取room属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * 设置room属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * 获取pstCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstCd() {
        return pstCd;
    }

    /**
     * 设置pstCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstCd(String value) {
        this.pstCd = value;
    }

    /**
     * 获取twnNm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * 设置twnNm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnNm(String value) {
        this.twnNm = value;
    }

    /**
     * 获取twnLctnNm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnLctnNm() {
        return twnLctnNm;
    }

    /**
     * 设置twnLctnNm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnLctnNm(String value) {
        this.twnLctnNm = value;
    }

    /**
     * 获取dstrctNm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstrctNm() {
        return dstrctNm;
    }

    /**
     * 设置dstrctNm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstrctNm(String value) {
        this.dstrctNm = value;
    }

    /**
     * 获取ctrySubDvsn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    /**
     * 设置ctrySubDvsn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsn(String value) {
        this.ctrySubDvsn = value;
    }

    /**
     * 获取ctry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * 设置ctry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the adrLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adrLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdrLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdrLine() {
        if (adrLine == null) {
            adrLine = new ArrayList<String>();
        }
        return this.adrLine;
    }

}
