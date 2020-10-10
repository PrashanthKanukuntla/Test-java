
 class Person {
int age;
String name;
double salary;
public Person() {
	age=25;
	name="Madhukar";
	salary=60000;
	System.out.println(age+" "+name+" "+salary);
	System.out.println("zero parameterized constructor");
}
public Person(int i, String s, double d){
	age=i;
	name=s;
	salary=d;
	System.out.println(age+" "+name+" "+salary);
	System.out.println("parameterized constrctor");
}
}
class Test{
	public static void main(String[] args) {
		Person p= new  Person();
		Person p1= new Person(25, "Prashanth",10000);
	}
}