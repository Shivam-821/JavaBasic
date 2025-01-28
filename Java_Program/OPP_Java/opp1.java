class Test
{
	static int x=10; 
	float f=38f;
	Test(){
		System.out.println("Test_constructor");
	}
	static{
		System.out.println(x);
		m_st();
		System.out.println("static_block");
	}
	public static void main(String[] args){
		System.out.println("main_first");
		Test t= new Test();
		System.out.println("main_last");
		
	}
	public static void m_st(){
		System.out.println(x);
		System.out.println(d);
		System.out.println("static_method");
	}
	{
		System.out.println(d);
		m_ins();
		System.out.println("instance_block");
	}
	public void m_ins(){
		System.out.println(a);
		System.out.println(f);
		System.out.println("instance_method");
	}
	static double d=85.34;
	int a=5;
}