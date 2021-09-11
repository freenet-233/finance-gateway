
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocumentType3Code的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType3Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RADM"/>
 *     &lt;enumeration value="RPIN"/>
 *     &lt;enumeration value="FXDR"/>
 *     &lt;enumeration value="DISP"/>
 *     &lt;enumeration value="PUOR"/>
 *     &lt;enumeration value="SCOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentType3Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum DocumentType3Code {


    /**
     * Document is a remittance advice sent separately from the current transaction.
     * 
     */
    RADM,

    /**
     * Document is a linked payment instruction to which the current payment instruction is related, for example, in a cover scenario.
     * 
     */
    RPIN,

    /**
     * Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers.
     * 
     */
    FXDR,

    /**
     * Document is a dispatch advice.
     * 
     */
    DISP,

    /**
     * Document is a purchase order.
     * 
     */
    PUOR,

    /**
     * Document is a structured communication reference provided by the creditor to identify the referred transaction.
     * 
     */
    SCOR;

    public String value() {
        return name();
    }

    public static DocumentType3Code fromValue(String v) {
        return valueOf(v);
    }

}
