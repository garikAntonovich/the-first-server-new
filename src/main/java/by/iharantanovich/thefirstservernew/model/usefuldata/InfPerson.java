package by.iharantanovich.thefirstservernew.model.usefuldata;

public class InfPerson {

    private String innPay;
    private String kppPay;
    private String cnamePay;

    public InfPerson() {
    }

    public InfPerson(String innPay, String kppPay, String cnamePay) {
        this.innPay = innPay;
        this.kppPay = kppPay;
        this.cnamePay = cnamePay;
    }

    public String getInnPay() {
        return innPay;
    }

    public void setInnPay(String innPay) {
        this.innPay = innPay;
    }

    public String getKppPay() {
        return kppPay;
    }

    public void setKppPay(String kppPay) {
        this.kppPay = kppPay;
    }

    public String getCnamePay() {
        return cnamePay;
    }

    public void setCnamePay(String cnamePay) {
        this.cnamePay = cnamePay;
    }

    @Override
    public String toString() {
        return "InfPerson{" +
                "innPay='" + innPay + '\'' +
                ", kppPay='" + kppPay + '\'' +
                ", cnamePay='" + cnamePay + '\'' +
                '}';
    }
}
