package branchingStatements_loop;

public class RoomReservation {
    public static void main(String[] args) {
        int kingBed = 120;
        int queenBed = 100;
        int singleBed = 80;
        String [] responses = {"yes", "king"};
        int responseIndex=0;
        String roomType ="";
        int price=0;
        int daysOfStay=3; // added number of days are staying.
        double percentageRate=0.8; // added .8% of taxes in the total price.

        while (true){
            String response = responses[responseIndex++].trim().toLowerCase();

            if(response.equals("yes")){
                while (true){
                    String roomResponse = responses[responseIndex++].trim().toLowerCase();

                    if(roomResponse.equals("king")){
                        price=kingBed;
                        roomType="King bed";
                        break;

                    } else if (roomResponse.equals("queen")) {
                        price = queenBed;
                        roomType = "Queen bed";
                        break;

                    } else if (roomResponse.equals("single")) {
                        price = singleBed;
                        roomType = "Single bed";
                        break;

                    }else{
                        System.out.println("Invalid room type. Please enter King, Queen or Single.");
                    }
                }

                double priceBeforeTax= price * daysOfStay;
                double totalTax = priceBeforeTax * (percentageRate / 100);
                double totalAmount = totalTax + priceBeforeTax;
                System.out.println("You have reserved a "+roomType+" room for "+daysOfStay+ " days. Total price before taxes is $" + priceBeforeTax+ "." + " Total amount will be $"+totalAmount+"."); //we wish### IntelliJ
                break;
            }else if(response.equals("no")){
                System.out.println("Have a nice day!");
                break;
            }else {
                System.out.println("Invalid response. Please enter yes or no.");
            }
        }


    }
}
/*
Create a class called RoomReservation, write a program for the room reservation.
     If user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

                King Bed ==> 120$
                Queen Bed ==> 100$
                single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.
 */