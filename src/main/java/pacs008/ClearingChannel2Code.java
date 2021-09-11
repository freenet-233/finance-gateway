
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ClearingChannel2Code的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ClearingChannel2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RTGS"/>
 *     &lt;enumeration value="RTNS"/>
 *     &lt;enumeration value="MPNS"/>
 *     &lt;enumeration value="BOOK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClearingChannel2Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum ClearingChannel2Code {


    /**
     * Clearing channel is a real-time gross settlement system.
     * 
     */
    RTGS,

    /**
     * Clearing channel is a real-time net settlement system.
     * 
     */
    RTNS,

    /**
     * Clearing channel is a mass payment net settlement system.
     * 
     */
    MPNS,

    /**
     * Payment through internal book transfer.
     * 
     */
    BOOK;

    public String value() {
        return name();
    }

    public static ClearingChannel2Code fromValue(String v) {
        return valueOf(v);
    }

}
