package test;

import java.util.Arrays;
import java.util.Random;

public class TestDriver {
	public static void main(String[] args) {
		int K=9, N=6;
		int[] num = new int[N];
		Random random = new Random();
		
		//������ �迭 ����
		for (int i = 0; i < num.length; i++) {
			num[i]=random.nextInt(9);
		}
		
		System.out.print("�Է�(N=" + N + ") : " + Arrays.toString(num) + "\n");

		// ������ �޼ҵ�
		int temp;
		for(int i=0; i<K; i++)
		for (int j = N-1; j > 0; j--) {
			if(j>=N)
				j=j%N;
			temp=num[j];
			num[j]=num[j-1];
			num[j-1]=temp;
		}
		System.out.println("���(K=" + K + ") : " + Arrays.toString(num));
	}
}