package csci3444.generics;

public class MainEntry {

	public static void main(String[] args) {
		MyGenInterface<Integer, String> mgi1 = new MyGenClass<Integer, String>(1, "Christina");
		MyGenInterface<Integer, Integer> mgi2 = new MyGenClass<Integer, Integer>(1, 2017);
		
		Integer i1 = MyRegularClass.<Integer>getSum(10, 20);
		Float f1 = MyRegularClass.<Float>getSum(100f, 200f);
		
		System.out.println("The first key and value is: " + mgi1.getKey() + ", " + mgi1.getValue());
		System.out.println("The second key and value is: " + mgi2.getKey() + ", " + mgi2.getValue());
		
		System.out.println("The Integer sum is: " + i1);
		System.out.println("The float sum is: " + f1);
		

	}

}
