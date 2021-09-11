
package pacs008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChargeBearerType1Code的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeBearerType1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEBT"/>
 *     &lt;enumeration value="CRED"/>
 *     &lt;enumeration value="SHAR"/>
 *     &lt;enumeration value="SLEV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeBearerType1Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
@XmlEnum
public enum ChargeBearerType1Code {


    /**
     * All transaction charges are to be borne by the debtor.
     * 
     */
    DEBT,

    /**
     * All transaction charges are to be borne by the creditor.
     * 
     */
    CRED,

    /**
     * In a credit transfer context, means that transaction charges on the sender side are to be borne by the debtor, transaction charges on the receiver side are to be borne by the creditor. In a direct debit context, means that transaction charges on the sender side are to be borne by the creditor, transaction charges on the receiver side are to be borne by the debtor.
     * 
     */
    SHAR,

    /**
     * Charges are to be applied following the rules agreed in the service level and/or scheme.
     * 
     */
    SLEV;

    public String value() {
        return name();
    }

    public static ChargeBearerType1Code fromValue(String v) {
        return valueOf(v);
    }

}
