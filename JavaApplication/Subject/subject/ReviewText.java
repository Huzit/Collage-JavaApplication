package subject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReviewText {
	// 문자열을 입력받아서 문자를 찾는다.
	// <저장할 문자열, 키 >
	HashMap<String, Integer> map = new HashMap<String, Integer>();

	public void text() {
		// 문자열을 입력받는다.
		try {
			File file = new File("C:\\Users\\건들지마\\Desktop\\test.txt");
			Scanner scanner = new Scanner(file);
			StringTokenizer stok = new StringTokenizer(scanner.nextLine(), " ,");

			String text;

			System.out.println("입력완료!!");

			// 파일에 저장
			while (stok.hasMoreTokens()) {
				text = stok.nextToken();
				// 만약에 해쉬맵에 입력받는 내용이 있다면 자동적으로 다음 키에 저장
				if (map.containsKey(text)) {
					map.put(text, map.get(text) + 1);
				}
				// 최초 입력
				else {
					map.put(text, 1);
				}
			}
			// 각 단어가 몇번 나오는지 출력
			System.out.println("각 단어별 나온횟수>>");
			for (String key : map.keySet())
				System.out.println(key + " 단어는 " + map.get(key) + "개 있습니다.");

			// 임의의 단어를 입력하면 몇 번 나오는지 출력
			System.out.println("\n찾고싶은 단어를 입력하세요>>");
			Scanner scan = new Scanner(System.in);
			String alpa = scan.nextLine();

			for (String key : map.keySet()) {
				if (alpa.equals(key))
					System.out.println(alpa + "는 " + map.get(key) + "번 나왔습니다.");
				else {
					System.out.println("입력하신 단어를 찾을 수 없습니다.");
					break;
				}
			}
		} catch (FileNotFoundException e) {
		}
	}

}
