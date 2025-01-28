import java.util.HashMap;
class Test
{
	public static void main(String[] args){
		HashMap h=new HashMap();
		System.out.println(h.put(1,"hello"));
		h.put(2,"Hi");
		h.put("abc",10);
		System.out.println(h);
		System.out.println(h.put(1,"Yes"));
		System.out.println(h);
		h.remove(2);

	}
}