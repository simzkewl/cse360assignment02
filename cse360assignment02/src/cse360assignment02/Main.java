package cse360assignment02;

public class Main {
	public static void main(String[] args) {
		AddingMachine am = new AddingMachine();
		
		am.add(4);
		am.subtract(2);
		am.add(5);
		
		System.out.println(am.toString());
		System.out.println(am.getTotal());
	}
}