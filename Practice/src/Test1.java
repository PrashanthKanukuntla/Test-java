
class Number {
static int count=0;
Number(){
	count++;
	System.out.println(count);
}
}
class Test1{
	public static void main(String[] args) {
		Number p= new Number();
		Number k= new Number();
	}
}