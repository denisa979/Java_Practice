package custom_class;

public class Rectangle {

    double length, width;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area
    public double area() {
        return length * width;
    }

    // Method to calculate perimeter
    public double perimeter() {
        return 2 * (length + width);
    }

    // Override toString method


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

}
/*
create a custom class named Rectangle
     Attributes:
         length, width

        Actions:
            setInfo(): sets the length and width of the rectangle object
            calculateArea(): calculates the area of the rectangle, returns it as double
            calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
            toString(): when a rectangle object is passed in print statement
                    it should display the length, width, area and perimeter of the Rectangle object
 */