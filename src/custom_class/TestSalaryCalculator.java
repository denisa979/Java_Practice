package custom_class;

public class TestSalaryCalculator {

    public static void main(String[] args) {
        //create an instance of salary
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        salaryCalculator.setSalary(45.0,0.8,0.6, 40);

        System.out.println(salaryCalculator);

                // Print the salary details with 2 decimal places
                System.out.println("Salary before tax = $" + String.format("%.2f", salaryCalculator.salary()));
                System.out.println("State tax = $" + String.format("%.2f", salaryCalculator.stateTax()));
                System.out.println("Federal tax = $" + String.format("%.2f", salaryCalculator.federalTax()));
                System.out.println("Salary after tax = $" + String.format("%.2f", salaryCalculator.salaryAfterTax()));


    }
}
