package day7;

import java.text.DecimalFormat;

public class SumArray {

	public static int[] inputArray()
	{
		int []a = {123,456,789};
		return a;
	}
	
	public static void sumArray(int []a)
	{
		
	}
	
	public static void showArray()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = inputArray();
		sumArray(array);

		double total = 123.50000;
		DecimalFormat format = new DecimalFormat("0.#");
		System.out.println(format.format(total));
		
	}

}
