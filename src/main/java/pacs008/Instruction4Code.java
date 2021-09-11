
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Instruction4Code的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Instruction4Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PHOA"/>
 *     &lt;enumeration value="TELA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Instruction4Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum Instruction4Code {


    /**
     * Please advise/contact next agent by phone.
     * 
     */
    PHOA,

    /**
     * Please advise/contact next agent by the most efficient means of telecommunication.
     * 
     */
    TELA;

    public String value() {
        return name();
    }

    public static Instruction4Code fromValue(String v) {
        return valueOf(v);
    }

}
