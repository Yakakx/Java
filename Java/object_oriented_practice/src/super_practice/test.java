package super_practice;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}
}
class A{
    A(){
    	this("Hello Zeck");
        System.out.println("這裡是A的建構子");
    }
    A(String str){
    	System.out.println("嗨這裡是A："+str);
    }
}
class B extends A{
    B(){
    	this("hello john");
        System.out.println("這裡是B的建構子");
    }
    B(String str){
    	super();
        System.out.println("嗨這裡是B："+str);
    }
}
class C extends B{
    C(){
        this("hello tina");
        System.out.println("這裡是C的建構子");
    }
    C(String str){
    	super();
        System.out.println("嗨這裡是C："+str);
    }
}