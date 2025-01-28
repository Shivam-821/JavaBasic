class Test
{
	int rollno;
	Test(int rollno){
		this.rollno=rollno;
	}
	public static void main(String[] args){
		Test t=new Test(10);
		Test t1=new Test(20);
		System.out.pritnln(t.equals(t1));
		Test t2=t;
		System.out.println(t.equals(t2));
	}
}