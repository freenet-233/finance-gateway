
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddressType2Code的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AddressType2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADDR"/>
 *     &lt;enumeration value="PBOX"/>
 *     &lt;enumeration value="HOME"/>
 *     &lt;enumeration value="BIZZ"/>
 *     &lt;enumeration value="MLTO"/>
 *     &lt;enumeration value="DLVY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressType2Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum AddressType2Code {


    /**
     * Address is the complete postal address.
     * 
     */
    ADDR,

    /**
     * Address is a postal office (PO) box.
     * 
     */
    PBOX,

    /**
     * Address is the home address.
     * 
     */
    HOME,

    /**
     * Address is the business address.
     * 
     */
    BIZZ,

    /**
     * Address is the address to which mail is sent.
     * 
     */
    MLTO,

    /**
     * Address is the address to which delivery is to take place.
     * 
     */
    DLVY;

    public String value() {
        return name();
    }

    public static AddressType2Code fromValue(String v) {
        return valueOf(v);
    }

}
