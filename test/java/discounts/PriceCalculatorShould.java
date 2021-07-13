package discounts;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


public class PriceCalculatorShould {

    @Test
    public void total_zero_when_there_are_prices() {

        PriceCalculator priceCalculator = new PriceCalculator();
        PriceCalculator calculator = null;
        assertThat( calculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices() {

        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10-2);
        calculator.addPrice( 15.5);

        assertThat(calculator.getTotal(), is(25.7));
    }

}