package lIFE;

public class ScoreDriver {

	public static void main(String[] args) {
		Score score = new Score();
		score.add("����",987);
		score.add("ȭ��",753);
		score.add("��������",954);
		score.add("����",257);
		
//		System.out.println((int)score.size()+"������ ��հ� : "+score.average());
//		System.out.println("�ִ밪 : "+score.max());
//		System.out.println("�ּڰ� : "+score.min());
		
		System.out.println(score.average());
		
	}

}