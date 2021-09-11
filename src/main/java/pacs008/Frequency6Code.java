
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Frequency6Code的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Frequency6Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="YEAR"/>
 *     &lt;enumeration value="MNTH"/>
 *     &lt;enumeration value="QURT"/>
 *     &lt;enumeration value="MIAN"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="DAIL"/>
 *     &lt;enumeration value="ADHO"/>
 *     &lt;enumeration value="INDA"/>
 *     &lt;enumeration value="FRTN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Frequency6Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum Frequency6Code {


    /**
     * Event takes place every year or once a year.
     * 
     */
    YEAR,

    /**
     * Event takes place every month or once a month.
     * 
     */
    MNTH,

    /**
     * Event takes place every three months or four times a year.
     * 
     */
    QURT,

    /**
     * Event takes place every six months or two times a year.
     * 
     */
    MIAN,

    /**
     * Event takes place once a week.
     * 
     */
    WEEK,

    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place on request or as necessary.
     * 
     */
    ADHO,

    /**
     * Event takes place several times a day.
     * 
     */
    INDA,

    /**
     * Event takes place every two weeks.
     * 
     */
    FRTN;

    public String value() {
        return name();
    }

    public static Frequency6Code fromValue(String v) {
        return valueOf(v);
    }

}
