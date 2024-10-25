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

        System.out.println("-------------------------------------");
//example from Naveen's class
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
            System.out.print(i +"" +j + " " );
        }
            System.out.println();
        }
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
/*
 @When("user sees {string} option")
    public void user_sees_option(String expectedOption ) {
       String actualOption = paymentPlanPage.chooseAPaymentPlanText.getText();
        Assert.assertEquals(expectedOption, actualOption );
    }
    @Then("each payment plan should be displayed as separate accordion")
    public void each_payment_plan_should_be_displayed_as_separate_accordion() {
        List<WebElement> accordions = DriverUtils.getDriver().findElements(By.xpath("/div[@class='payment-plan']/mat-accordion"));
        for (WebElement accordion : accordions) {
            System.out.println("accordion.getText() = " + accordion.getText());
        }

        }

    @Then("no accordion is clicked by default")
    public void no_accordion_is_clicked_by_default() {

        List<WebElement> accordions = DriverUtils.getDriver().findElements(By.xpath("/div[@class='payment-plan']/mat-accordion"));
        for (WebElement accordion : accordions) {
            String ariaExpanded = accordion.getAttribute("class");
            Assert.assertEquals("Accordion should not be expanded by default", "false", ariaExpanded);
        }
    }
    @Then("no accordion is expanded by default")
    public void no_accordion_is_expanded_by_default() {
        List<WebElement> accordionContents = DriverUtils.getDriver().findElements(By.xpath("//div[@class='mat-expansion-panel-body ng-tns-c1859850774-6']"));

        for (WebElement content : accordionContents) {
            Assert.assertFalse("Accordion content should not be visible", content.isDisplayed());
        }
    }
    @Then("user should see {string} payment option on first row")
    public void user_should_see_payment_option_on_first_row(String upfrontText) {
       String actualUpfrontText = paymentPlanPage.upfrontPaymentOption.getText();
        Assert.assertEquals(upfrontText, actualUpfrontText);

    }
    @Then("upfront price on the second row with text {string}")
    public void upfront_price_on_the_second_row_with_text(String upfrontPrice) {
    String actualUpfrontPrice = paymentPlanPage.upfrontPaymentAmount.getText();
    Assert.assertEquals(upfrontPrice, actualUpfrontPrice);


    }


}
 */