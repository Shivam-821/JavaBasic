import java.util.ArrayList;
import java.util.Collections;
class Test
{
	static void ArrL(ArrayList<Integer> ar){
		ar.add(63);
		System.out.println(ar);
	}
	public static void main(String[] args){
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(25);
		ar.add(10);
		ar.add(74);
		System.out.println(ar);
		System.out.println("Let's go to method");
		ArrL(ar);
		System.out.println(ar);
		System.out.println("Let's sort the collection");
		Collections.sort(ar);
		System.out.println(ar);

	}
}