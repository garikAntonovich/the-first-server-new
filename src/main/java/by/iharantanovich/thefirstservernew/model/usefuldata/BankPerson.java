package by.iharantanovich.thefirstservernew.model.usefuldata;

public class BankPerson {

    private String bsPay;
    private String bicPay;
    private String bsKsPay;

    public BankPerson() {
    }

    public String getBsPay() {
        return bsPay;
    }

    public void setBsPay(String bsPay) {
        this.bsPay = bsPay;
    }

    public String getBicPay() {
        return bicPay;
    }

    public void setBicPay(String bicPay) {
        this.bicPay = bicPay;
    }

    public String getBsKsPay() {
        return bsKsPay;
    }

    public void setBsKsPay(String bsKsPay) {
        this.bsKsPay = bsKsPay;
    }

    @Override
    public String toString() {
        return "BankPerson{" +
                "bsPay='" + bsPay + '\'' +
                ", bicPay='" + bicPay + '\'' +
                ", bsKsPay='" + bsKsPay + '\'' +
                '}';
    }
}
