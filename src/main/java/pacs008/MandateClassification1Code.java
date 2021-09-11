
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MandateClassification1Code的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MandateClassification1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIXE"/>
 *     &lt;enumeration value="USGB"/>
 *     &lt;enumeration value="VARI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MandateClassification1Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum MandateClassification1Code {


    /**
     * Direct debit amount is fixed.
     * 
     */
    FIXE,

    /**
     * Direct debit amount is based on usage.
     * 
     */
    USGB,

    /**
     * Direct debit amount is variable.
     * 
     */
    VARI;

    public String value() {
        return name();
    }

    public static MandateClassification1Code fromValue(String v) {
        return valueOf(v);
    }

}
