package test;

import java.util.Arrays;
import java.util.Random;

public class TestDriver {
	public static void main(String[] args) {
		int K=9, N=6;
		int[] num = new int[N];
		Random random = new Random();
		
		//랜덤한 배열 생성
		for (int i = 0; i < num.length; i++) {
			num[i]=random.nextInt(9);
		}
		
		System.out.print("입력(N=" + N + ") : " + Arrays.toString(num) + "\n");

		// 돌리는 메소드
		int temp;
		for(int i=0; i<K; i++)
		for (int j = N-1; j > 0; j--) {
			if(j>=N)
				j=j%N;
			temp=num[j];
			num[j]=num[j-1];
			num[j-1]=temp;
		}
		System.out.println("출력(K=" + K + ") : " + Arrays.toString(num));
	}
}