import java.util.ArrayList;
class Test
{
	public static void main(String[] args){
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("shivam");
		a.add(10.5);
		a.add('d');
		a.add(a);
		a.add(1,"hello");
		a.add(a);
	}
}