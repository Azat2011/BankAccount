package bankaccountapp;

public class Checking extends Account {
    private int debitCartNumber;
    private int debitCartPin;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        //System.out.println("NEW CHECKING ACCOUNT ");
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    private void setDebitCard() {
        debitCartNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCartPin = (int) (Math.random() * Math.pow(10, 4));
        //System.out.println("CARD: " + this.debitCartNumber);
        //System.out.println("PIN: " + this.debitCartPin);

    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features " +
                "\nDebit Card Number: " + debitCartNumber +
                "\nDebit Card PIN: " + debitCartPin);
    }
}