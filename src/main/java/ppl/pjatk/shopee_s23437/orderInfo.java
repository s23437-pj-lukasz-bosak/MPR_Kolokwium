package ppl.pjatk.shopee_s23437;

public class orderInfo {
    int wartoscZakupow;
    Status status;

    public orderInfo(int wartoscZakupow, Status status) {
        this.wartoscZakupow = wartoscZakupow;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
