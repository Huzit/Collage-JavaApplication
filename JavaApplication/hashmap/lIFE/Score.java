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
		
		//1.for 2.while 그리고 3.배열을 위한 for문
			for(double i : array)
				average+=i;
		return average/array.size();
	}*/
	/*
	//4.Iterator을 이용한 반복문
	public double average() {
		double average=0;
		
		Iterator<Double> iterator = array.iterator();
		
		while(iterator.hasNext())//다음 변수가 있을경우 true반환
			average+=iterator.next();//하나하나 차례대로 반환
		
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
