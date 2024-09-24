package custom_class;

public class SalaryCalculator {

    double hourlyRate, stateTaxRate, federalTaxRate, weeklyHours;

    public SalaryCalculator() {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate / 100;
        this.federalTaxRate = federalTaxRate / 100;
        this.weeklyHours = weeklyHours;


    }

    public void setSalary(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate / 100;
        this.federalTaxRate = federalTaxRate / 100;
        this.weeklyHours = weeklyHours;

    }

    public double salary() {
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax() {
        return salary() * stateTaxRate;
    }

    public double federalTax() {
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax() {
        return salary() - (stateTax() + federalTax());
    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }
}
/*
Create a custom class named SalaryCalculator
     Attributes:
         hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will be responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
                it should display the salary, stateTax, federalTax, salaryAfterTax of the Object

 */