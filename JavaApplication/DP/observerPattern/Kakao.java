package observerPattern;

import java.util.ArrayList;

public class Kakao {
		ArrayList<KakaoObserver> observers = new ArrayList<>();
		
		public Kakao() {
			
		}
		//파티원 추
		public void addObserver(KakaoObserver o) {
			observers.add(o);
		}
		//관찰자 제거
		public void deletObserver(KakaoObserver o) {
			observers.remove(o);
		}
		//메세지를 업데이트
		public void newChat(String msg) {
			broadcast(msg);
		}
		//메세지를 전부 발송
		public void broadcast(String msg) {
			for(KakaoObserver o : observers) {
				o.update(msg);
			}
		}
}