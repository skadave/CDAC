package in.cdac.ques5;



public class Program {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[4];
		Array.acceptRecord(arr1);
		System.out.println();
		Array.acceptRecord(arr2);
		
		int[] arr1Unique = Array.removeDuplicates(arr1);
		int[] arr2Unique = Array.removeDuplicates(arr2);

		
//		System.out.println(Arrays.toString(arr1Unique));
//		System.out.println(Arrays.toString(arr2Unique));
//		System.out.print("Unique elements in the array are: ");
//		for(int element:arr1Unique) {
//				System.out.print(element+" ");
//		}
//		for(int element:arr2Unique) {
//			System.out.print(element+" ");
//		}
		
		Array.findIntersection(arr1Unique, arr2Unique);
		
		
		
	}

}
