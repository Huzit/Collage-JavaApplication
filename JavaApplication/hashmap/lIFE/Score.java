package lIFE;

import java.util.*;

public class Score {
	//private ArrayList<Double> array = new ArrayList<>();
	private HashMap<String,Double>	array = new HashMap<>();
	public void add(String subject,double data) {
		array.put(subject, data);
	}
	
	/*public double average() {
		double average=0;
		
		//1.for 2.while �׸��� 3.�迭�� ���� for��
			for(double i : array)
				average+=i;
		return average/array.size();
	}*/
	/*
	//4.Iterator�� �̿��� �ݺ���
	public double average() {
		double average=0;
		
		Iterator<Double> iterator = array.iterator();
		
		while(iterator.hasNext())//���� ������ ������� true��ȯ
			average+=iterator.next();//�ϳ��ϳ� ���ʴ�� ��ȯ
		
		return average/array.size();
		
	}*/
	public double average() {
		double agerage=0;
		double sum=0;
		for(String subject : array.keySet())
			sum+=array.get(subject);
		return sum;
	}
	
	/*public double max() {
		double max=array.get(0);
		
		for(double i : array)
			if(max<i)
				max=i;
		return max;
	}
	
	public double min() {
		double min=array.get(0);
		
		for(double i : array)
			if(min>i)
				min=i;
		return min;
	}
	
	public double size() {
		return array.size();
	}*/
	
}
