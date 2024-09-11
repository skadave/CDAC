package in.cdac.ques7;

import java.util.Scanner;

public class ArrayPrac {
	private int[] arr;
	
	public ArrayPrac(){
		this(4);
	}
	public ArrayPrac(int size){
		arr = new int[size];
	}
	
	private Scanner sc = new Scanner(System.in);
	
	
	public void acceptRecord() {
		for(int i=0;i<this.arr.length;i++) {
			System.out.print("arr["+i+"]: ");
			this.arr[i] = sc.nextInt();
		}
	}
	
	
	public void printRecord() {
		for(int i=0;i<this.arr.length;i++) {
			System.out.print(this.arr[i]+"  ");
		}
	}
	
}
