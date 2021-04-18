package lab9;

import java.util.Scanner;

@FunctionalInterface
interface Interface4{
	Example getVariable();
}

@FunctionalInterface
interface Interface5{
	Example setVariable(String variable);
}

class Example{
	String variable;
	
	Example(){}
	Example(String variable){
		this.variable = variable;
	}
	public String getVariable() {
		return variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}
	
}
public class MethodReference {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Interface4 intf = Example :: new;
		Example ex = intf.getVariable();
		System.out.println(ex.variable);
		
		Interface5 intf1 = Example :: new;
		System.out.println("Enter any String value");
		Example ex1 = intf1.setVariable(sc.nextLine());
		System.out.println(ex1.variable);
		sc.close();
	}

}
