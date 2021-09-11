
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Priority3Code的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Priority3Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="URGT"/>
 *     &lt;enumeration value="HIGH"/>
 *     &lt;enumeration value="NORM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Priority3Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum Priority3Code {


    /**
     * Priority level is urgent (highest priority possible).
     * 
     */
    URGT,

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

    public static Priority3Code fromValue(String v) {
        return valueOf(v);
    }

}
