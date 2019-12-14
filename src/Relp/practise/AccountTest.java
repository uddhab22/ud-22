package Relp.practise;

public class AccountTest {

	public static void main(String[] args) {
		Account mm = new Account();
	    mm.setAcc(7890000000l);
	    mm.setName("Sumair");
	    mm.setemail("sumair@syntaxsolutions.com ");
	    mm.setAmount(500000.0);
	    
	    System.out.print(mm.getAcc()+" "+mm.getName()+" "+mm.getEmail()+" "+mm.getAmount());
	    
	
	}

}
