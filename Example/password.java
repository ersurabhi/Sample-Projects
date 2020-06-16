package Example;

import java.util.Base64;

public class password {

	
	public static void main(String[] args) {

		String password = "011087SJ%s";
		
		String encodedPassword = new String(Base64.getEncoder().encode(password.getBytes()));
		
		System.out.println(encodedPassword);
		String decodedPassword = new String(Base64.getDecoder().decode(encodedPassword.getBytes()));
		System.out.println(decodedPassword);
	}
}


