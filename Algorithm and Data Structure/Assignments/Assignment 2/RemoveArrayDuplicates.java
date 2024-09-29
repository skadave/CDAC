import java.util.*;

public class RemoveArrayDuplicates{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size of array: ");
	int n = sc.nextInt();
	int[] arr = new int[n];


	for(int i=0; i<n; i++)
	{
		System.out.print("Enter element "+ i+" : ");
		arr[i] = sc.nextInt();                         // Input array  e.g. 1 1 2 2
	}
	
	ArrayList<Integer> arrayList = new ArrayList<>();
	
	
	// If array is already sorted, just add the last number from the group of repeated numbers to the new array i.e. only last occurence of that number
	for(int i=0; i<n-1; i++)
	{												
		if(arr[i] != arr[i+1])                         // 1 != 1 false ; 1 != 2 true -> add last occurence of no. in new array; 2 != 2 false; won't go on last element of arr
			arrayList.add(arr[i]); 
	}
	arrayList.add(arr[n-1]);  //adding last remaining element
	
	System.out.println(arrayList.size());
	


/* Another method using HashSet to store unique values
	Integer[] arr = new Integer[n];
	
	HashSet<Integer> set = new HashSet<>();
	for(int i=0; i<n; i++)
	{
		System.out.print("Enter element "+ i+" : ");
		arr[i] = sc.nextInt();
		set.add(arr[i]);
	}
	
	System.out.println(set.size());
	
*/


	}

}

/*
Time Complexity: O(n)

Space Complexity: O(n)	
	
*/