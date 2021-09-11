
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PreferredContactMethod1Code的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PreferredContactMethod1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LETT"/>
 *     &lt;enumeration value="MAIL"/>
 *     &lt;enumeration value="PHON"/>
 *     &lt;enumeration value="FAXX"/>
 *     &lt;enumeration value="CELL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreferredContactMethod1Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum PreferredContactMethod1Code {


    /**
     * Preferred method used to reach the contact is per letter.
     * 
     */
    LETT,

    /**
     * Preferred method used to reach the contact is per email.
     * 
     */
    MAIL,

    /**
     * Preferred method used to reach the contact is per phone.
     * 
     */
    PHON,

    /**
     * Preferred method used to reach the contact is per fax.
     * 
     */
    FAXX,

    /**
     * Preferred method used to reach the contact is per mobile or cell phone.
     * 
     */
    CELL;

    public String value() {
        return name();
    }

    public static PreferredContactMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
