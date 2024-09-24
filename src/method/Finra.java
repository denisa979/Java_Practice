package method;

public class Finra {

    public static void main(String[] args) {
        String result="";

        for (int i = 1; i < 101 ; i++) {
            if(i%15==0){
                result+="FINRA ";
            } else if (i % 5==0) {
                result+="RA ";
            }else if(i % 3 ==0){
                result+="FIN ";
            }else{
                result+= i +" ";
            }
        }
        System.out.println(result);
    }


}
/*
Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

 ex:
     output:
         1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN

write a program that can calculate the sum of all numbers between 1 to any given number
         ex:
             input: 100
             output: 5050

                input: 50
                output: 1275

Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                    ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

write a program that can retrive the digits, letters and special characters from a string
         Ex:
             input:
                 mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

Write a program that can return the sum of digits from a  string
          Ex:
              input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
                     To convert char to number:
                                            '0' - 48   ==> 0
                                            '1' - 48   ==> 1
 */