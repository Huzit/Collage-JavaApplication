package observerPattern;

public class KakaoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kakao sv1 = new Kakao();
		
		KakaoApp app = new KakaoApp(sv1);
		KakaoApp app1 = new KakaoApp(sv1);
		KakaoApp app2 = new KakaoApp(sv1);
	}

}
