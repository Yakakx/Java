package ex1;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 3) {
			 System.out.println(
			 "Usage: java Calculator operand1 operator operand2");
			 System.exit(1);
		 }
		int result = 0;
		int op1 = 0;
		int op2 = 0;
		
		try{
			op1 = Integer.parseInt(args[0]);
		}
		catch(Exception ex) {
			System.out.println("Wrong input: " + args[0]);
			System.exit(-1);
		}
		try{
			op2 = Integer.parseInt(args[2]);
		}
		catch(Exception ex) {
			System.out.println("Wrong input: " + args[2]);
			System.exit(-1);
		}
		switch(args[1].charAt(0)) {
		case '+': result=op1+op2; break;
		case '-': result=op1-op2; break;
		case '*': result=op1*op2; break;
		case '/': result=op1/op2; break;
		
		}
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
				+ " = " + result);
	}

}
