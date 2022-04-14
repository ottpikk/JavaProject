package liveCoding.invoiceTask;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DiscountTest {

    @Test
    void valueOf() {
        Discount[] discounts = Discount.values();
        List<Double> doubleEnum = new ArrayList<>();
        double maxDiscount = 1.0;
        double minDiscount = 0.0;
        int failedTests = 0;
        for (Discount discount: discounts){
            doubleEnum.add(discount.getPercentage());
            if (discount.getPercentage() > maxDiscount || discount.getPercentage() < minDiscount){
                System.out.println("Test not passed !!!");
                System.out.println("Discount value of " + discount.getPercentage() + " not allowed!!!");
                failedTests++;
            }
        }
        if(failedTests == 0){
            System.out.println("Test passed successfully!!!");
        }
    }
}