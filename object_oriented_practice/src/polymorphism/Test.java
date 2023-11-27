package polymorphism;

public class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Animal a = new Animal(12);
		System.out.println(a.getInfo());
		Animal b = new Animal();
		System.out.println(b.getInfo());
		Dog c = new Dog();
		System.out.println(c.getInfo());
		Dog d = new Dog(30,24,"yellow");
		System.out.println(d.getInfo());
		System.out.println(Animal.total+" "+Dog.total);
	}
}
class Animal{
	int height, weight;
	static int total;
	
	Animal(){
		this(-1,-1);
	}
	Animal(int h){
		this(h,-1);
	}
	Animal(int h, int w){
		height = h;
		weight = w;
		total++;
	}
	String getInfo() {
		return "Height: "+height+" Weight: "+weight+" Total: "+total;
	}
}
class Dog extends Animal{
	String color;
	static int total;
	
	Dog(){
		this(-1,-1,"noset");
	}
	Dog(int h){
		this(h,-1,"noset");
	}
	Dog(int h, int w){
		this(h,w,"noset");
	}
	Dog(String c){
		this(-1,-1,c);
	}
	Dog(int h, String c){
		this(h,-1,c);
	}
	Dog(int a, int b, String c){
		super(a,b);
		color = c;
		total++;
	}
	String getInfo() {
		return super.getInfo()+" Color: "+color;
	}
}