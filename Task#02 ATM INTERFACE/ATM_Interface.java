import java.util.Scanner;

public class ATM_Interface {
	public static void main(String[] args) {
		int choice;
		int PIN = 0,UserID = 0;
		int balance = 1500,withdraw,deposit;
		Scanner S = new Scanner(System.in);
			System.out.println("-------WELCOME TO ATM-------");
			System.out.println("Enter UserID");
			UserID = S.nextInt();
			if(UserID == 5454) {
				System.out.println("Enter PIN");
				PIN = S.nextInt();
			}if(PIN == 8905) {
				System.out.println("Choose option from the below menu");
			}
			else if(UserID!=5454){
				System.out.println("Incorrect UserId");
			}
			else {
				System.out.println("Incorrect PIN");
			}
			while(UserID==5454 && PIN==8905) {

			System.out.println("\nChoose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for Transfer");
			System.out.println("Choose 5 for Exit");
		
			choice = S.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter money to be withdrawn:");
			withdraw = S.nextInt();
			if(balance >= withdraw) {
				System.out.println("Please collect your money.");
				balance = balance - withdraw;
				System.out.println("Balance = "+balance); 
			}else {
				System.out.println("Insufficient Balance.");
			}
			
			break;
			
			case 2: System.out.println("Enter money to be deposited:");
			deposit = S.nextInt();
			balance = balance+deposit;
			System.out.println("Balance = "+balance);
			break;
			
			case 3: System.out.println("Balance = "+balance);
			break;
			
			case 4:System.out.println("Transer to the account\n Enter account number:");
			int accountNum = S.nextInt();
			System.out.println("Enter receipient name:");
			String receipientName = S.next();
			System.out.println("Enter amount to be transferred:");
			int amount = S.nextInt();
			if(balance > amount) {
				System.out.println(amount+ " Rs transferred to "+receipientName+" Successfully.");
			}
			else {
				System.out.println("Insufficient Balance.");
			}
			break;
			
			case 5:System.exit(0);
			break;
			
			default: System.out.println("Invalid Option");
			}	
			System.out.println("\nTHANK YOU");
	}
	}
}
