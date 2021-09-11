
package pacs008;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Provides further details specific to the individual transaction(s) included in the message.
 * 
 * <p>CreditTransferTransaction50 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreditTransferTransaction50">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PaymentIdentification13"/>
 *         &lt;element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PaymentTypeInformation28" minOccurs="0"/>
 *         &lt;element name="IntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ActiveCurrencyAndAmount"/>
 *         &lt;element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISODate" minOccurs="0"/>
 *         &lt;element name="SttlmPrty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Priority3Code" minOccurs="0"/>
 *         &lt;element name="SttlmTmIndctn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}SettlementDateTimeIndication1" minOccurs="0"/>
 *         &lt;element name="SttlmTmReq" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}SettlementTimeRequest2" minOccurs="0"/>
 *         &lt;element name="AccptncDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISODateTime" minOccurs="0"/>
 *         &lt;element name="PoolgAdjstmntDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ISODate" minOccurs="0"/>
 *         &lt;element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BaseOneRate" minOccurs="0"/>
 *         &lt;element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}ChargeBearerType1Code"/>
 *         &lt;element name="ChrgsInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Charges7" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MndtRltdInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CreditTransferMandateData1" minOccurs="0"/>
 *         &lt;element name="PrvsInstgAgt1" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         &lt;element name="PrvsInstgAgt1Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CashAccount40" minOccurs="0"/>
 *         &lt;element name="PrvsInstgAgt2" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         &lt;element name="PrvsInstgAgt2Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CashAccount40" minOccurs="0"/>
 *         &lt;element name="PrvsInstgAgt3" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         &lt;element name="PrvsInstgAgt3Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CashAccount40" minOccurs="0"/>
 *         &lt;element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         &lt;element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt1" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt1Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CashAccount40" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt2" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt2Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CashAccount40" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt3" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt3Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CashAccount40" minOccurs="0"/>
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PartyIdentification135" minOccurs="0"/>
 *         &lt;element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PartyIdentification135" minOccurs="0"/>
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PartyIdentification135"/>
 *         &lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CashAccount40" minOccurs="0"/>
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BranchAndFinancialInstitutionIdentification6"/>
 *         &lt;element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CashAccount40" minOccurs="0"/>
 *         &lt;element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}BranchAndFinancialInstitutionIdentification6"/>
 *         &lt;element name="CdtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CashAccount40" minOccurs="0"/>
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PartyIdentification135"/>
 *         &lt;element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}CashAccount40" minOccurs="0"/>
 *         &lt;element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}PartyIdentification135" minOccurs="0"/>
 *         &lt;element name="InstrForCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}InstructionForCreditorAgent3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstrForNxtAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}InstructionForNextAgent1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}Purpose2Choice" minOccurs="0"/>
 *         &lt;element name="RgltryRptg" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}RegulatoryReporting3" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}TaxInformation10" minOccurs="0"/>
 *         &lt;element name="RltdRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}RemittanceLocation7" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}RemittanceInformation21" minOccurs="0"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferTransaction50", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", propOrder = {
    "pmtId",
    "pmtTpInf",
    "intrBkSttlmAmt",
    "intrBkSttlmDt",
    "sttlmPrty",
    "sttlmTmIndctn",
    "sttlmTmReq",
    "accptncDtTm",
    "poolgAdjstmntDt",
    "instdAmt",
    "xchgRate",
    "chrgBr",
    "chrgsInf",
    "mndtRltdInf",
    "prvsInstgAgt1",
    "prvsInstgAgt1Acct",
    "prvsInstgAgt2",
    "prvsInstgAgt2Acct",
    "prvsInstgAgt3",
    "prvsInstgAgt3Acct",
    "instgAgt",
    "instdAgt",
    "intrmyAgt1",
    "intrmyAgt1Acct",
    "intrmyAgt2",
    "intrmyAgt2Acct",
    "intrmyAgt3",
    "intrmyAgt3Acct",
    "ultmtDbtr",
    "initgPty",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "cdtrAgt",
    "cdtrAgtAcct",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr",
    "instrForCdtrAgt",
    "instrForNxtAgt",
    "purp",
    "rgltryRptg",
    "tax",
    "rltdRmtInf",
    "rmtInf",
    "splmtryData"
})
public class CreditTransferTransaction50 {

    @XmlElement(name = "PmtId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected PaymentIdentification13 pmtId;
    @XmlElement(name = "PmtTpInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected PaymentTypeInformation28 pmtTpInf;
    @XmlElement(name = "IntrBkSttlmAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected ActiveCurrencyAndAmount intrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmDt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "SttlmPrty", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "string")
    protected Priority3Code sttlmPrty;
    @XmlElement(name = "SttlmTmIndctn", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected SettlementDateTimeIndication1 sttlmTmIndctn;
    @XmlElement(name = "SttlmTmReq", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected SettlementTimeRequest2 sttlmTmReq;
    @XmlElement(name = "AccptncDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accptncDtTm;
    @XmlElement(name = "PoolgAdjstmntDt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar poolgAdjstmntDt;
    @XmlElement(name = "InstdAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected ActiveOrHistoricCurrencyAndAmount instdAmt;
    @XmlElement(name = "XchgRate", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BigDecimal xchgRate;
    @XmlElement(name = "ChrgBr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "ChrgsInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<Charges7> chrgsInf;
    @XmlElement(name = "MndtRltdInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CreditTransferMandateData1 mndtRltdInf;
    @XmlElement(name = "PrvsInstgAgt1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BranchAndFinancialInstitutionIdentification6 prvsInstgAgt1;
    @XmlElement(name = "PrvsInstgAgt1Acct", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CashAccount40 prvsInstgAgt1Acct;
    @XmlElement(name = "PrvsInstgAgt2", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BranchAndFinancialInstitutionIdentification6 prvsInstgAgt2;
    @XmlElement(name = "PrvsInstgAgt2Acct", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CashAccount40 prvsInstgAgt2Acct;
    @XmlElement(name = "PrvsInstgAgt3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BranchAndFinancialInstitutionIdentification6 prvsInstgAgt3;
    @XmlElement(name = "PrvsInstgAgt3Acct", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CashAccount40 prvsInstgAgt3Acct;
    @XmlElement(name = "InstgAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BranchAndFinancialInstitutionIdentification6 instgAgt;
    @XmlElement(name = "InstdAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BranchAndFinancialInstitutionIdentification6 instdAgt;
    @XmlElement(name = "IntrmyAgt1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt1;
    @XmlElement(name = "IntrmyAgt1Acct", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CashAccount40 intrmyAgt1Acct;
    @XmlElement(name = "IntrmyAgt2", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt2;
    @XmlElement(name = "IntrmyAgt2Acct", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CashAccount40 intrmyAgt2Acct;
    @XmlElement(name = "IntrmyAgt3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt3;
    @XmlElement(name = "IntrmyAgt3Acct", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CashAccount40 intrmyAgt3Acct;
    @XmlElement(name = "UltmtDbtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected PartyIdentification135 ultmtDbtr;
    @XmlElement(name = "InitgPty", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected PartyIdentification135 initgPty;
    @XmlElement(name = "Dbtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected PartyIdentification135 dbtr;
    @XmlElement(name = "DbtrAcct", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CashAccount40 dbtrAcct;
    @XmlElement(name = "DbtrAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected BranchAndFinancialInstitutionIdentification6 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CashAccount40 dbtrAgtAcct;
    @XmlElement(name = "CdtrAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected BranchAndFinancialInstitutionIdentification6 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CashAccount40 cdtrAgtAcct;
    @XmlElement(name = "Cdtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10", required = true)
    protected PartyIdentification135 cdtr;
    @XmlElement(name = "CdtrAcct", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected CashAccount40 cdtrAcct;
    @XmlElement(name = "UltmtCdtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected PartyIdentification135 ultmtCdtr;
    @XmlElement(name = "InstrForCdtrAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<InstructionForCreditorAgent3> instrForCdtrAgt;
    @XmlElement(name = "InstrForNxtAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<InstructionForNextAgent1> instrForNxtAgt;
    @XmlElement(name = "Purp", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected Purpose2Choice purp;
    @XmlElement(name = "RgltryRptg", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<RegulatoryReporting3> rgltryRptg;
    @XmlElement(name = "Tax", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected TaxInformation10 tax;
    @XmlElement(name = "RltdRmtInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<RemittanceLocation7> rltdRmtInf;
    @XmlElement(name = "RmtInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected RemittanceInformation21 rmtInf;
    @XmlElement(name = "SplmtryData", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10")
    protected List<SupplementaryData1> splmtryData;

    /**
     * 获取pmtId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification13 }
     *     
     */
    public PaymentIdentification13 getPmtId() {
        return pmtId;
    }

    /**
     * 设置pmtId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification13 }
     *     
     */
    public void setPmtId(PaymentIdentification13 value) {
        this.pmtId = value;
    }

    /**
     * 获取pmtTpInf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation28 }
     *     
     */
    public PaymentTypeInformation28 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * 设置pmtTpInf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation28 }
     *     
     */
    public void setPmtTpInf(PaymentTypeInformation28 value) {
        this.pmtTpInf = value;
    }

    /**
     * 获取intrBkSttlmAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * 设置intrBkSttlmAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIntrBkSttlmAmt(ActiveCurrencyAndAmount value) {
        this.intrBkSttlmAmt = value;
    }

    /**
     * 获取intrBkSttlmDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * 设置intrBkSttlmDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * 获取sttlmPrty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getSttlmPrty() {
        return sttlmPrty;
    }

    /**
     * 设置sttlmPrty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public void setSttlmPrty(Priority3Code value) {
        this.sttlmPrty = value;
    }

    /**
     * 获取sttlmTmIndctn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SettlementDateTimeIndication1 }
     *     
     */
    public SettlementDateTimeIndication1 getSttlmTmIndctn() {
        return sttlmTmIndctn;
    }

    /**
     * 设置sttlmTmIndctn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDateTimeIndication1 }
     *     
     */
    public void setSttlmTmIndctn(SettlementDateTimeIndication1 value) {
        this.sttlmTmIndctn = value;
    }

    /**
     * 获取sttlmTmReq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public SettlementTimeRequest2 getSttlmTmReq() {
        return sttlmTmReq;
    }

    /**
     * 设置sttlmTmReq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public void setSttlmTmReq(SettlementTimeRequest2 value) {
        this.sttlmTmReq = value;
    }

    /**
     * 获取accptncDtTm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccptncDtTm() {
        return accptncDtTm;
    }

    /**
     * 设置accptncDtTm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccptncDtTm(XMLGregorianCalendar value) {
        this.accptncDtTm = value;
    }

    /**
     * 获取poolgAdjstmntDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPoolgAdjstmntDt() {
        return poolgAdjstmntDt;
    }

    /**
     * 设置poolgAdjstmntDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPoolgAdjstmntDt(XMLGregorianCalendar value) {
        this.poolgAdjstmntDt = value;
    }

    /**
     * 获取instdAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getInstdAmt() {
        return instdAmt;
    }

    /**
     * 设置instdAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setInstdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.instdAmt = value;
    }

    /**
     * 获取xchgRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * 设置xchgRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgRate(BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * 获取chrgBr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * 设置chrgBr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public void setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the chrgsInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgsInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgsInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charges7 }
     * 
     * 
     */
    public List<Charges7> getChrgsInf() {
        if (chrgsInf == null) {
            chrgsInf = new ArrayList<Charges7>();
        }
        return this.chrgsInf;
    }

    /**
     * 获取mndtRltdInf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public CreditTransferMandateData1 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * 设置mndtRltdInf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public void setMndtRltdInf(CreditTransferMandateData1 value) {
        this.mndtRltdInf = value;
    }

    /**
     * 获取prvsInstgAgt1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getPrvsInstgAgt1() {
        return prvsInstgAgt1;
    }

    /**
     * 设置prvsInstgAgt1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setPrvsInstgAgt1(BranchAndFinancialInstitutionIdentification6 value) {
        this.prvsInstgAgt1 = value;
    }

    /**
     * 获取prvsInstgAgt1Acct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPrvsInstgAgt1Acct() {
        return prvsInstgAgt1Acct;
    }

    /**
     * 设置prvsInstgAgt1Acct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setPrvsInstgAgt1Acct(CashAccount40 value) {
        this.prvsInstgAgt1Acct = value;
    }

    /**
     * 获取prvsInstgAgt2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getPrvsInstgAgt2() {
        return prvsInstgAgt2;
    }

    /**
     * 设置prvsInstgAgt2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setPrvsInstgAgt2(BranchAndFinancialInstitutionIdentification6 value) {
        this.prvsInstgAgt2 = value;
    }

    /**
     * 获取prvsInstgAgt2Acct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPrvsInstgAgt2Acct() {
        return prvsInstgAgt2Acct;
    }

    /**
     * 设置prvsInstgAgt2Acct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setPrvsInstgAgt2Acct(CashAccount40 value) {
        this.prvsInstgAgt2Acct = value;
    }

    /**
     * 获取prvsInstgAgt3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getPrvsInstgAgt3() {
        return prvsInstgAgt3;
    }

    /**
     * 设置prvsInstgAgt3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setPrvsInstgAgt3(BranchAndFinancialInstitutionIdentification6 value) {
        this.prvsInstgAgt3 = value;
    }

    /**
     * 获取prvsInstgAgt3Acct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPrvsInstgAgt3Acct() {
        return prvsInstgAgt3Acct;
    }

    /**
     * 设置prvsInstgAgt3Acct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setPrvsInstgAgt3Acct(CashAccount40 value) {
        this.prvsInstgAgt3Acct = value;
    }

    /**
     * 获取instgAgt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstgAgt() {
        return instgAgt;
    }

    /**
     * 设置instgAgt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstgAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instgAgt = value;
    }

    /**
     * 获取instdAgt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstdAgt() {
        return instdAgt;
    }

    /**
     * 设置instdAgt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstdAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instdAgt = value;
    }

    /**
     * 获取intrmyAgt1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * 设置intrmyAgt1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setIntrmyAgt1(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt1 = value;
    }

    /**
     * 获取intrmyAgt1Acct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getIntrmyAgt1Acct() {
        return intrmyAgt1Acct;
    }

    /**
     * 设置intrmyAgt1Acct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setIntrmyAgt1Acct(CashAccount40 value) {
        this.intrmyAgt1Acct = value;
    }

    /**
     * 获取intrmyAgt2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * 设置intrmyAgt2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setIntrmyAgt2(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt2 = value;
    }

    /**
     * 获取intrmyAgt2Acct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getIntrmyAgt2Acct() {
        return intrmyAgt2Acct;
    }

    /**
     * 设置intrmyAgt2Acct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setIntrmyAgt2Acct(CashAccount40 value) {
        this.intrmyAgt2Acct = value;
    }

    /**
     * 获取intrmyAgt3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt3() {
        return intrmyAgt3;
    }

    /**
     * 设置intrmyAgt3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setIntrmyAgt3(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt3 = value;
    }

    /**
     * 获取intrmyAgt3Acct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getIntrmyAgt3Acct() {
        return intrmyAgt3Acct;
    }

    /**
     * 设置intrmyAgt3Acct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setIntrmyAgt3Acct(CashAccount40 value) {
        this.intrmyAgt3Acct = value;
    }

    /**
     * 获取ultmtDbtr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * 设置ultmtDbtr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setUltmtDbtr(PartyIdentification135 value) {
        this.ultmtDbtr = value;
    }

    /**
     * 获取initgPty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getInitgPty() {
        return initgPty;
    }

    /**
     * 设置initgPty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setInitgPty(PartyIdentification135 value) {
        this.initgPty = value;
    }

    /**
     * 获取dbtr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getDbtr() {
        return dbtr;
    }

    /**
     * 设置dbtr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setDbtr(PartyIdentification135 value) {
        this.dbtr = value;
    }

    /**
     * 获取dbtrAcct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * 设置dbtrAcct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDbtrAcct(CashAccount40 value) {
        this.dbtrAcct = value;
    }

    /**
     * 获取dbtrAgt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * 设置dbtrAgt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtrAgt = value;
    }

    /**
     * 获取dbtrAgtAcct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * 设置dbtrAgtAcct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDbtrAgtAcct(CashAccount40 value) {
        this.dbtrAgtAcct = value;
    }

    /**
     * 获取cdtrAgt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * 设置cdtrAgt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setCdtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtrAgt = value;
    }

    /**
     * 获取cdtrAgtAcct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * 设置cdtrAgtAcct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setCdtrAgtAcct(CashAccount40 value) {
        this.cdtrAgtAcct = value;
    }

    /**
     * 获取cdtr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getCdtr() {
        return cdtr;
    }

    /**
     * 设置cdtr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setCdtr(PartyIdentification135 value) {
        this.cdtr = value;
    }

    /**
     * 获取cdtrAcct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * 设置cdtrAcct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setCdtrAcct(CashAccount40 value) {
        this.cdtrAcct = value;
    }

    /**
     * 获取ultmtCdtr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * 设置ultmtCdtr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setUltmtCdtr(PartyIdentification135 value) {
        this.ultmtCdtr = value;
    }

    /**
     * Gets the value of the instrForCdtrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrForCdtrAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrForCdtrAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionForCreditorAgent3 }
     * 
     * 
     */
    public List<InstructionForCreditorAgent3> getInstrForCdtrAgt() {
        if (instrForCdtrAgt == null) {
            instrForCdtrAgt = new ArrayList<InstructionForCreditorAgent3>();
        }
        return this.instrForCdtrAgt;
    }

    /**
     * Gets the value of the instrForNxtAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrForNxtAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrForNxtAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionForNextAgent1 }
     * 
     * 
     */
    public List<InstructionForNextAgent1> getInstrForNxtAgt() {
        if (instrForNxtAgt == null) {
            instrForNxtAgt = new ArrayList<InstructionForNextAgent1>();
        }
        return this.instrForNxtAgt;
    }

    /**
     * 获取purp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Purpose2Choice }
     *     
     */
    public Purpose2Choice getPurp() {
        return purp;
    }

    /**
     * 设置purp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose2Choice }
     *     
     */
    public void setPurp(Purpose2Choice value) {
        this.purp = value;
    }

    /**
     * Gets the value of the rgltryRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rgltryRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatoryReporting3 }
     * 
     * 
     */
    public List<RegulatoryReporting3> getRgltryRptg() {
        if (rgltryRptg == null) {
            rgltryRptg = new ArrayList<RegulatoryReporting3>();
        }
        return this.rgltryRptg;
    }

    /**
     * 获取tax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxInformation10 }
     *     
     */
    public TaxInformation10 getTax() {
        return tax;
    }

    /**
     * 设置tax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInformation10 }
     *     
     */
    public void setTax(TaxInformation10 value) {
        this.tax = value;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocation7 }
     * 
     * 
     */
    public List<RemittanceLocation7> getRltdRmtInf() {
        if (rltdRmtInf == null) {
            rltdRmtInf = new ArrayList<RemittanceLocation7>();
        }
        return this.rltdRmtInf;
    }

    /**
     * 获取rmtInf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation21 }
     *     
     */
    public RemittanceInformation21 getRmtInf() {
        return rmtInf;
    }

    /**
     * 设置rmtInf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation21 }
     *     
     */
    public void setRmtInf(RemittanceInformation21 value) {
        this.rmtInf = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
