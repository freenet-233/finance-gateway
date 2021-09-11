
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NamePrefix2Code的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="NamePrefix2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOCT"/>
 *     &lt;enumeration value="MADM"/>
 *     &lt;enumeration value="MISS"/>
 *     &lt;enumeration value="MIST"/>
 *     &lt;enumeration value="MIKS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamePrefix2Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum NamePrefix2Code {


    /**
     * Title of the person is Doctor or Dr.
     * 
     */
    DOCT,

    /**
     * Title of the person is Madam.
     * 
     */
    MADM,

    /**
     * Title of the person is Miss.
     * 
     */
    MISS,

    /**
     * Title of the person is Mister or Mr.
     * 
     */
    MIST,

    /**
     * Title of the person is gender neutral (Mx).
     * 
     */
    MIKS;

    public String value() {
        return name();
    }

    public static NamePrefix2Code fromValue(String v) {
        return valueOf(v);
    }

}
