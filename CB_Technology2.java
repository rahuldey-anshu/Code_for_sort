package classProject;
import java.util.Arrays;
import java.util.Scanner;

public class CB_Technology2 {
	
	static int[] big_no(int n)
	{
		String s = Integer.toString(n);
		
		int[] arr = new int[s.length()];
		
		for(int i=0 ; i<s.length(); i++)
		{
			arr[i] = s.charAt(i) - '0' ;
		}
		
		 Arrays.sort(arr);
			
			return arr ;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = sc.nextInt() ;
		int [] arr = new int[20];
		arr= big_no(n);
		
	System.out.println("Sorted order is");
		for(int i=arr.length-1 ; i>=0 ; i--)
		{
			System.out.print(arr[i]);
		}	
	}
	}
	


