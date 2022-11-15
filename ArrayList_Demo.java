package Lec_12;
import java.util.*;
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(1215);
		System.out.println(list);
		list.set(2, 1512);
		System.out.println(list);
		System.out.println(list.get(0));
		list.add(143);
		list.add(112);
		list.add(115);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}
