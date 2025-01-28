class math
{
	public double hoho=2;
}
class complex_math extends math
{
	public double hoho=4;
}
class In_math extends complex_math
{
	public double hoho=8;
	public static void main(String[] args){
		math m=new In_math();
		System.out.println(m.hoho);
	}
}
