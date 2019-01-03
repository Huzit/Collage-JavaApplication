package vector;

import java.util.Vector;

public class Myvector {
	Vector<Integer> vector = new Vector<Integer>();
	
	public void add(int number) {
		
	}
	public void sort() {
		mergeSort(0, vector.size()-1, vector);
	}
	public void mergeSort(int low, int high, Vector whole) {
		int middle = (int)Math.floor((low+high)/2);
		Vector<Integer> left = new Vector<Integer>();
		Vector<Integer> right = new Vector<Integer>();
		
		for(int i=0; i<=middle; i++)
			left.add((int)whole.get(i));
		for(int i=middle+1; i<=high; i++)
			right.add((int)whole.get(i));
		
		mergeSort(low, middle, left);
		mergeSort(middle+1, high, right);
		combine(left, right);
	}
	public void combine (Vector left, Vector right) {
		int i=0, j=0;
		
		while ((i<left.size())&&(j<right.size())) {
			
		}
	}
}
