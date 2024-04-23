package String_StringBuilder;

public class PasswordTester {
	public static boolean isGoodPassword(String password) {
		  String length = ".{8,}";
	      String uppercase = "[A-Z]";
	      String lowercase = "[a-z]";
	      String digit = "\\d";
	      String specialCharacters = " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
	      
	      if (password.matches(length) &&
	              password.matches(uppercase) &&
	              password.matches(lowercase) &&
	              password.matches(digit) &&
	              password.matches(specialCharacters)) {
	              return true;
	          }
	      }
	public static void main(String[] args) {
		
	}
}