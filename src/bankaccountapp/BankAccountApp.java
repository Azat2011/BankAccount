package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    //
    public static void main(String[] args) {
       List<Account> accounts = new LinkedList<Account>();
        /*
        Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);

        Savings savacc1 = new Savings("Rich Lowe", "987654321",2500);

        //savacc1.compound();

        savacc1.showInfo();
        System.out.println("************");
        chkacc1.showInfo();

        //savacc1.deposit(5000);
        //savacc1.withdraw(200);
        //savacc1.transfer("Brokerage", 3000);
    */
        String file = "/Users/user/Downloads/NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {

            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            Double initDeposit = Double.parseDouble(accountHolder[3]);
            //System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
            if (accountType.equals("Savings")) {
                //System.out.println("Open a SAVINGS account");
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")){
                //System.out.println("Open a CHECKING account");
                accounts.add(new Checking(name, sSN, initDeposit));
            }else {
                System.out.println("Error reading account type");
            }
        }
        //accounts.get(5).showInfo();
        for (Account acc:accounts){
            System.out.println("\n***********");
            acc.showInfo();
        }
        accounts.get((int) Math.random()*accounts.size()).deposit(10000);
        accounts.get((int) Math.random()*accounts.size()).deposit(1500);
    }
}