package csci3444.generics;

public class MainEntry {

	public static void main(String[] args) {
		MyGenInterface<Integer, String> mgi1 = new MyGenClass<Integer, String>(1, "Christina");
		MyGenInterface<Integer, Integer> mgi2 = new MyGenClass<Integer, Integer>(1, 2017);
		
//		MyRegularClass.getSum(11, 12);
		
		Integer i1 = MyRegularClass.<Integer>getSum(10, 20);
		Float f1 = MyRegularClass.<Float>getSum(100f, 200f);
		
		System.out.println(mgi1);
		System.out.println(mgi2);
		
		System.out.println(i1);
		System.out.println(f1);
		

	}

}
