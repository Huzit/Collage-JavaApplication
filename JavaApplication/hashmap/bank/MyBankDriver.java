package bank;

import java.util.Scanner;

public class MyBankDriver {

	public static void main(String[] args) {
		int num;
		MyBank bank = new MyBank();
		do {
			System.out.println("1. 신규/2. 입금/3. 인출/4. 이체");
			Scanner scanner = new Scanner(System.in);
			num=scanner.nextInt();
			switch(num) {
			case 1:bank.newAccount();break;
			case 2:bank.deposit();break;
			case 3:bank.withdraw();break;
			case 4:bank.transper();break;
			}
		}while(true);
	}

}
