package Lec_12;
import java.util.*;
public class Intersection_in_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int[] arr1=new int[m];
		for(int i=0;i<m;i++)
			arr1[i]=sc.nextInt();
		int n=sc.nextInt();
		int[]arr2=new int[n];
		for(int i=0;i<n;i++)
			arr2[i]=sc.nextInt();
		ArrayList<Integer> AL=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<m && j<n)
		{
			if(arr1[i]==arr2[j])
			{
				AL.add(arr1[i]);
			i++;
			j++;
			}
			else if(arr1[i]<arr2[j])
				i++;
			else
				j++;
		}
		System.out.println(AL);
	}

}
