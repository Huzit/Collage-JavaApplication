package subject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReviewText {
	// ���ڿ��� �Է¹޾Ƽ� ���ڸ� ã�´�.
	// <������ ���ڿ�, Ű >
	HashMap<String, Integer> map = new HashMap<String, Integer>();

	public void text() {
		// ���ڿ��� �Է¹޴´�.
		try {
			File file = new File("C:\\Users\\�ǵ�����\\Desktop\\test.txt");
			Scanner scanner = new Scanner(file);
			StringTokenizer stok = new StringTokenizer(scanner.nextLine(), " ,");

			String text;

			System.out.println("�Է¿Ϸ�!!");

			// ���Ͽ� ����
			while (stok.hasMoreTokens()) {
				text = stok.nextToken();
				// ���࿡ �ؽ��ʿ� �Է¹޴� ������ �ִٸ� �ڵ������� ���� Ű�� ����
				if (map.containsKey(text)) {
					map.put(text, map.get(text) + 1);
				}
				// ���� �Է�
				else {
					map.put(text, 1);
				}
			}
			// �� �ܾ ��� �������� ���
			System.out.println("�� �ܾ ����Ƚ��>>");
			for (String key : map.keySet())
				System.out.println(key + " �ܾ�� " + map.get(key) + "�� �ֽ��ϴ�.");

			// ������ �ܾ �Է��ϸ� �� �� �������� ���
			System.out.println("\nã����� �ܾ �Է��ϼ���>>");
			Scanner scan = new Scanner(System.in);
			String alpa = scan.nextLine();

			for (String key : map.keySet()) {
				if (alpa.equals(key))
					System.out.println(alpa + "�� " + map.get(key) + "�� ���Խ��ϴ�.");
				else {
					System.out.println("�Է��Ͻ� �ܾ ã�� �� �����ϴ�.");
					break;
				}
			}
		} catch (FileNotFoundException e) {
		}
	}

}
