public class Account {
    private String accountName;
    private double accountBal;

    public Account(String accountName, double accountBal) {
        if(accountBal < 0) {
            System.out.println("Starting balance cannot be less than zero.\nBalance set to $0.00");
        }else {
            this.accountName = accountName;
            this.accountBal = accountBal;
            System.out.println("Account initialized.\nBalance set to $" + this.accountBal);
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAccountBal() {
        return accountBal;
    }

    public void transferFunds(double withdrawal){
        if(withdrawal > this.accountBal){
            System.out.printf("Unable to transfer $%.2f. Balance is insufficient.\n",withdrawal);
        }else if(withdrawal < 0){
            System.out.println("Transfer amount must be greater than zero. Transfer failed.");
        }else{
            this.accountBal -= withdrawal;
            System.out.printf("Transfer of $%.2f successful. Your new balance is $%.2f.\n",withdrawal,this.accountBal);
        }
    }

    public void addFunds(double deposit){
        if(deposit < 0){
            System.out.println("Amount deposited must be greater than zero.");
        }else {
            this.accountBal += deposit;
            System.out.printf("Deposit of $%.2f successful. Your new balance is $%.2f.\n",deposit,this.accountBal);
        }
    }
}