
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreditDebitCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CreditDebitCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRDT"/>
 *     &lt;enumeration value="DBIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditDebitCode", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum CreditDebitCode {


    /**
     * Operation is an increase.
     * 
     */
    CRDT,

    /**
     * Operation is a decrease.
     * 
     */
    DBIT;

    public String value() {
        return name();
    }

    public static CreditDebitCode fromValue(String v) {
        return valueOf(v);
    }

}
