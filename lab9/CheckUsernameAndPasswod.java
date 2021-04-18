package lab9;

interface Interface2{
	boolean check(String username, String password);
}

public class CheckUsernameAndPasswod {

	public static void main(String[] args) {
		
		Interface2 intf = (username,password) ->{
			if((username != "Sudarvizhi B")&&(password != "Hoseok")){
				return false;
			}
			else {
				return true;
			}
		};
		System.out.print(intf.check("Sudarvizhi B" , "Hoseok"));
		
	}

}
