package lIFE;

public class ScoreDriver {

	public static void main(String[] args) {
		Score score = new Score();
		score.add("수학",987);
		score.add("화학",753);
		score.add("지구과학",954);
		score.add("물리",257);
		
//		System.out.println((int)score.size()+"과목의 평균값 : "+score.average());
//		System.out.println("최대값 : "+score.max());
//		System.out.println("최솟값 : "+score.min());
		
		System.out.println(score.average());
		
	}

}