package GroupTask;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration r = new Registration();
		r.setEmail("@gmail.com");
		r.setUserName("uddhab.rijal");
		r.setPassword("0123456@!$%^");
		
		String email = r.getEmail();
		String user = r.getUserName();
		String password = r.getPassword();
		
		
		System.out.println(user+email+" and your password is "+password);
	}

}
