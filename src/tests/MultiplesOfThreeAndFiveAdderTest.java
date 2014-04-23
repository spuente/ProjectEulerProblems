package tests;

import org.junit.Test;
import spuente.projecteuler.MultiplesOfThreeAndFiveAdder;

import static org.junit.Assert.assertEquals;

/**
 * Created by spuente on 23/04/14.
 */
public class MultiplesOfThreeAndFiveAdderTest {

    @Test
    public void shouldReturn23ForNumbersUpTo10() {

        MultiplesOfThreeAndFiveAdder multiplesOfThreeAndFiveAdder = new  MultiplesOfThreeAndFiveAdder();

        int result = multiplesOfThreeAndFiveAdder.addNumbersUpTo(10);

        assertEquals(23, result);
    }
}
