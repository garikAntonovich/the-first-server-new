package by.iharantanovich.thefirstservernew.model.usefuldata;

public class UsefulData {

    private String docNum;
    private String docDate;
    private String docGUID;
    private String operType;
    private Double amountOut;
    private InfPerson infPay;
    private BankPerson bankPay;
    private InfPerson infRcp;
    private BankPerson bankRcp;
    private String purpose;

    public UsefulData() {
    }

    public UsefulData(String docNum, String docDate, String docGUID, String operType, Double amountOut, InfPerson infPay, BankPerson bankPay,
                      InfPerson infRcp, BankPerson bankRcp, String purpose) {
        this.docNum = docNum;
        this.docDate = docDate;
        this.docGUID = docGUID;
        this.operType = operType;
        this.amountOut = amountOut;
        this.infPay = infPay;
        this.bankPay = bankPay;
        this.infRcp = infRcp;
        this.bankRcp = bankRcp;
        this.purpose = purpose;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public String getDocGUID() {
        return docGUID;
    }

    public void setDocGUID(String docGUID) {
        this.docGUID = docGUID;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public Double getAmountOut() {
        return amountOut;
    }

    public void setAmountOut(Double amountOut) {
        this.amountOut = amountOut;
    }

    public InfPerson getInfPay() {
        return infPay;
    }

    public void setInfPay(InfPerson infPay) {
        this.infPay = infPay;
    }

    public BankPerson getBankPay() {
        return bankPay;
    }

    public void setBankPay(BankPerson bankPay) {
        this.bankPay = bankPay;
    }

    public InfPerson getInfRcp() {
        return infRcp;
    }

    public void setInfRcp(InfPerson infRcp) {
        this.infRcp = infRcp;
    }

    public BankPerson getBankRcp() {
        return bankRcp;
    }

    public void setBankRcp(BankPerson bankRcp) {
        this.bankRcp = bankRcp;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "UsefulData{" +
                "docNum='" + docNum + '\'' +
                ", docDate='" + docDate + '\'' +
                ", docGUID='" + docGUID + '\'' +
                ", operType='" + operType + '\'' +
                ", amountOut=" + amountOut +
                ", infPay=" + infPay +
                ", bankPay=" + bankPay +
                ", infRcp=" + infRcp +
                ", bankRcp=" + bankRcp +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
