package custom_class;

public class Car {

    String make, model, color;
    int year;
    double price;


    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;

    }

    @Override
    public String toString() {
        return
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=$" + price ;
    }
}
/*
  1. Create a custom class named Car
        Attributes:
            make, model, year, color, price

        Actions:
            setInfo(): sets all the fields of the car object
            toString(): when a car object is passed in print statement, it should display all the information of the car object
            start()

 */