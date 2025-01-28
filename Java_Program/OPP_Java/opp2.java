class Dog
{
	static int x=12;
	float a=399.4f;
	Dog(){
		System.out.println("kutta");
	}
	static{
		System.out.println("Static_block");
		dog_static();
	}
	public static void main(String[] args){
		System.out.println("Dog_main_start");
		Dog d=new Dog();
		System.out.println("Dog_main_end");
	}
	public static void dog_static(){
		System.out.println(x);
		System.out.println(y);
		System.out.println("Dog_static_method");
	}
	{
		System.out.println("Instance_block");
		dog_instance();
	}
	public void dog_instance(){
		System.out.println(a);
		System.out.println(b);
		System.out.println("Dog_instance_method");
	}
	static int y=35;
	float b=49.3f;


}
class Puppy extends Dog
{
	Puppy(){
		System.out.println("chota");
	}
	static int z=86;
	float n=222.45f;
	static{
		System.out.println("Static_block");
		Puppy_static();
	}
	public static void main(String[] args){
		System.out.println("Puppy_main_start");
		Puppy d=new Puppy();
		System.out.println("Puppy_main_end");
	}
	public static void Puppy_static(){
		System.out.println(z);
		System.out.println(e);
		System.out.println("Puppy_static_method");
	}
	{
		System.out.println("Instance_block");
		Puppy_instance();
	}
	public void Puppy_instance(){
		System.out.println(n);
		System.out.println(h);
		System.out.println("Puppy_instance_method");
	}
	static int e=11;
	float h=99.33f;


}
