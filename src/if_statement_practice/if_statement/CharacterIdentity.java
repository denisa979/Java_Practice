package if_statement_practice.if_statement;

public class CharacterIdentity {


        public static void main(String[] args) {
            char ch = '@'; // Example character
            String result = "#";

            if (ch >= '0' && ch <= '9') {
                result = "digit";
            } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                result = "Alphabetic Character";
            } else {
                result = "Special Character";
            }

            System.out.println(result);

    }


}
/*

 Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'
			output:
				Special Character

			ch = '1'
			output:
				digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */