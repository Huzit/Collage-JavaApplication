package bank;

import java.util.HashMap;
import java.util.Scanner;

public class MyBank {
	private HashMap<String, MyAccount> map = new HashMap<String, MyAccount>();
	// String : 생년월일, MyAccount : 계좌
	Scanner scan = new Scanner(System.in);
	String birthday;

	// 신규계좌 개설
	public void newAccount() {

		guide("생년월일을 입력해주세요 : ");
		birthday = scan.nextLine();

		System.out.print("이름을 입력해주세요 : ");
		String name = scan.nextLine();

		MyAccount myAccount = new MyAccount(name);
		map.put(birthday, myAccount);
	}

	private void guide(String message) {
		System.out.println(message);
	}

	public void deposit() {
		MyAccount account = login();
		double money;
		if (account == null)
			return;

		guide(account.getName() + "님아 입금할 금액을 입력하세요:");
		money = scan.nextDouble();
		//생년월일을 입력받아서 다시 입금
//		guide("생년월일을 입력해주세요");
//		String birthday = scan.next();
		//입력받은 생년월일키값의 잔액을 재설정
		map.get(birthday).setBalance(map.get(birthday).getBalance()+money);
		
		guide("고객님의 현재잔액은"+map.get(birthday).getBalance());
	}

	private MyAccount login() {
		MyAccount account = null;
		String birth;
		while (true) {
			guide("생년월일을 입력해주세요(0을 누르면 종료됩니다.) : ");
			birth = scan.next();

			if (birth.equals("0"))
				break;
			// 해쉬맵에서 입력받은 생년월일을 키값으로 저장한 데이터를 불러 온다.
			account = map.get(birth);
			// 불러왔음에도 없을경우 null을 반환한다.
			if (account != null)
				break;
		}
		return account;
	}

	public void withdraw() {

	}

	public void transper() {

	}

	// ===============================================MyAccount의 생성자
	private class MyAccount {
		double balance;
		String name;

		public MyAccount(String name, double balance) {
			this.name = name;
			this.balance = balance;
		}

		public MyAccount(String name) {
			this(name, 0);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
	}

}
