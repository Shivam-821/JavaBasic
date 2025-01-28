class Father
{
	Father(){
		//super();
		System.out.println("Super_Father_constr.");
	}
	Father(int k){
		//this();
		System.out.println("this_Father_constr.");
	}
	public static void main(String[] args){
		Father f= new Father(2);
	}
}
class Child extends Father
{
	Child(){
		//super(13);
		System.out.println("Child_super_constr.");
	}
	Child(int n){
		//this();
		System.out.println("Child_this_constr.");
	}
	public static void main(String[] args){
		Child c= new Child();
	}
}