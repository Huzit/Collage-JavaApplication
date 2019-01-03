package bank;

import java.util.HashMap;
import java.util.Scanner;

public class MyBank {
	private HashMap<String, MyAccount> map = new HashMap<String, MyAccount>();
	// String : �������, MyAccount : ����
	Scanner scan = new Scanner(System.in);
	String birthday;

	// �ű԰��� ����
	public void newAccount() {

		guide("��������� �Է����ּ��� : ");
		birthday = scan.nextLine();

		System.out.print("�̸��� �Է����ּ��� : ");
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

		guide(account.getName() + "�Ծ� �Ա��� �ݾ��� �Է��ϼ���:");
		money = scan.nextDouble();
		//��������� �Է¹޾Ƽ� �ٽ� �Ա�
//		guide("��������� �Է����ּ���");
//		String birthday = scan.next();
		//�Է¹��� �������Ű���� �ܾ��� �缳��
		map.get(birthday).setBalance(map.get(birthday).getBalance()+money);
		
		guide("������ �����ܾ���"+map.get(birthday).getBalance());
	}

	private MyAccount login() {
		MyAccount account = null;
		String birth;
		while (true) {
			guide("��������� �Է����ּ���(0�� ������ ����˴ϴ�.) : ");
			birth = scan.next();

			if (birth.equals("0"))
				break;
			// �ؽ��ʿ��� �Է¹��� ��������� Ű������ ������ �����͸� �ҷ� �´�.
			account = map.get(birth);
			// �ҷ��������� ������� null�� ��ȯ�Ѵ�.
			if (account != null)
				break;
		}
		return account;
	}

	public void withdraw() {

	}

	public void transper() {

	}

	// ===============================================MyAccount�� ������
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
