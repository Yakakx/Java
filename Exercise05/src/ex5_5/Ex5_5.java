package ex5_5;

public class Ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Celsius\tFahrenheit");
		System.out.print("   |   ");
		System.out.println("Fahrenheit\tCelsius");
		
		for(int i=0, j=20 ; i<=100; i+=2, j+=5) {
			System.out.printf("%d\t%10.3f",i,(i/5.)*9.+32);
			System.out.printf("   |   ");
			System.out.printf("%d\t\t%7.3f\n",j,(j-32)/9.*5.);
		}
	}
}
