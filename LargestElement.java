package com.bridge.D3_assignments;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = {1.2,2.3,3.4,4.5};
		
		//finding the max value
		double max = myList[0];
		for(int i=0;i<myList.length;i++) {
			if( myList[i]>max)
				max = myList[i];
			}
		System.out.println("max val is: "+max);

	}

}
