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
	          } else {
	              System.err.println("Password ist zu schwach!");
	              return false;
	          }
	      }
	
    public static void main(String[] args) {
        String password = "dsfjdsfjsdfAH02D??!";
        if (isGoodPassword(password)) {
            System.out.println(password + " ist ein gutes Passwort.");
        } else {
            System.out.println(password + " ist kein gutes Passwort.");
        }
    }
}