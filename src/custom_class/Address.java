package custom_class;

public class Address {

    public int buildingNumber, zipCode;
    public String street, city, state;

    public static String country = "United States", planet = "Earth";

    public void setInfo(int buildingNumber, String street, String city, String state, int zipCode ){

        this.buildingNumber=buildingNumber;
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
    }// sets all attributes of the Address object

    @Override
    public String toString() {
       return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode;
    }

}
/*
Create a class named Address
 Attributes:
     buildingNumber, street, city, state, zipCode
 Actions
         setInfo: sets all the instances
         toString: returns the address
                     EX:
                         7925 Jones Branch Dr
                         McLean Va, 22012
 */