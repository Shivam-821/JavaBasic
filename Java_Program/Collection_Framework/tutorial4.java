import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;
//we can also use implicit import: java.util.*;
class Mycomp implements Comparator
{
	public int compare(Object o1,Object o2){
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return -i1.compareTo(i2);
	}
}
class tutorial4
{
	static int num;
	/*public int divisor(){
		for
	}*/
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Mycomp mc=new Mycomp();
		ArrayList ar=new ArrayList();
		TreeSet tr=new TreeSet();
		//code for divisior
		System.out.print("Enter the number: ");
		num = s.nextInt();
		for(int i=1;i*i<=num;i++){	//i*i<=num --> math.sqrt(num);
			if(num%i==0){
				tr.add(i);
				ar.add(i);
				if((num/i) != i){
					tr.add((num/i));
					ar.add((num/i));
				}
			}
		}
		System.out.println("TreeSet"+tr);
		System.out.println("ArrayList"+ar);
		Collections.sort(ar);
		System.out.println("ArrayList with collections Sort"+ar);
		Collections.sort(ar,mc);
		System.out.println("ArrayList with collections Sort using customized Sorting"+ar);
		


	}
}