import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		BankAccount useraccount=new BankAccount(1000);
		ATM atm=new ATM(useraccount);
		atm.run();
	}
	
	double balance;
	public BankAccount(double initialBalance) {
		balance= initialBalance;
	}
	public double getBalance() {
		return balance;	
	}
    public void deposit(double amount) {
    	balance=+amount;
    }
    public boolean withdraw(double amount) {
    	if(amount<=balance) {
    		balance-=amount;
    		return true;
    	}
    	return false;
    }
	}

class ATM {
	private BankAccount account;
	public ATM(BankAccount bankaccount) {
		account=bankaccount;
	}
	public void displayMenu() {
		System.out.println("ATM Menu");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
	}
	public void run() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			displayMenu();
			System.out.println("Select option");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Your balance Rs:"+account.getBalance());
				break;
			case 2:
				System.out.println("Enter amount deposit");
				double depositAmount=sc.nextDouble();
				account.deposit(depositAmount);
				System.out.println("Deposit Successful. Your Balance: Rs" +account.getBalance());
				break;
			case 3:
				System.out.println("Enter amount to withdraw");
				double withdrawAmount=sc.nextDouble();
				if(account.withdraw(withdrawAmount)) {
					System.out.println("Withdrawal Successful. Your Balance: Rs" +account.getBalance());
				}else {
					System.out.println("Insufficient amount");
				}
			case 4:
                  System.out.println("Thank you for using ATM");
                  return;
                  default:
                  System.out.println("Invalid option. Please select valid option");
			}
		}

	}
}