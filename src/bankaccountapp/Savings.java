package bankaccountapp;

public class Savings extends Account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        //System.out.println("NEW SAVINGS ACCOUNT: ");
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        //System.out.println(safetyDepositBoxID);
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
        //System.out.println(safetyDepositBoxKey);
    }

    public void showInfo() {
        //System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                        "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                        "\nSafety Deposit Box Key: " + safetyDepositBoxKey);
    }
}