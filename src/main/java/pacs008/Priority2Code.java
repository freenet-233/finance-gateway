
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Priority2Code的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Priority2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HIGH"/>
 *     &lt;enumeration value="NORM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Priority2Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum Priority2Code {


    /**
     * Priority level is high.
     * 
     */
    HIGH,

    /**
     * Priority level is normal.
     * 
     */
    NORM;

    public String value() {
        return name();
    }

    public static Priority2Code fromValue(String v) {
        return valueOf(v);
    }

}
