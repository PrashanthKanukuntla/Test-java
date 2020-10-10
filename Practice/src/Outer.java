/**
//Inner class
class Outer {
class Inner{
	void innerMethod() {
		System.out.println("Inner method is callin");
	}
}
void outerMethod() {
	System.out.println("Outer method is calling");
	//Inner i= new Inner();
	//i.innerMethod();
}
public static void main(String[] args) {
	Outer o= new Outer();
	o.outerMethod();
	Outer.Inner i= new Outer().new Inner();
	i.innerMethod();
}
}
*/
/**
//Member inner class
class Outer{
	void outerMethod() {
		class Inner{
			void innerMethod() {
				System.out.println("this is innerMethod");
			}
		}
		Inner i= new Inner();
		i.innerMethod();
	}
	public static void main(String[] args) {
		Outer o= new Outer();
		o.outerMethod();
	}
}*/

//anonyomus inner class














































