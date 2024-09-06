package if_statement_practice.if_statement;

public class NetIncomeCalc {

    public static void main(String[] args) {
        double salary = 100000;
        boolean isMarried = true;
        double taxRate = 0;


        if (salary >= 130000) {
            taxRate = .35;
        } else if (salary >= 100000 & salary <= 129000) {
            taxRate = .30;
        } else if (salary >= 80000 & salary <= 99000) {
            taxRate = .25;
        } else {
            taxRate = .20;
        }
        if (isMarried) {
            taxRate = .05;
        }
        double netIncome = salary * (1 - taxRate);
        System.out.println("netIncome: $" + netIncome);
    }
}

/*
 Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax


 */