
public class Bike {
	int i;
	String k;
Bike(int ik, String m){
	i=ik;
	k=m;
	
}
void display() {
	System.out.println(i+" "+k);
}
public static void main(String[] args) {
	Bike b= new Bike(1,"Hero");
	b.display();
}
}
