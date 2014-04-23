package tests;

import org.junit.Before;
import org.junit.Test;
import spuente.projecteuler.MultipleOfNumberChecker;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by spuente on 23/04/14.
 */
public class MultipleOfNumberCheckerTest {

    private MultipleOfNumberChecker multipleOfNumberChecker;

    @Before
    public void setUp() {

        multipleOfNumberChecker = new MultipleOfNumberChecker();
    }

    @Test
    public void shouldReturnTrueForNumberMultipleOfThree() {

        boolean isMultipleOfThree = multipleOfNumberChecker.isMultipleOfThreeOrFive(12);

        assertTrue(isMultipleOfThree);
    }

    @Test
    public void shouldReturnFalseForNumberNotMultipleOfThree() {

        boolean isMultipleOfThree = multipleOfNumberChecker.isMultipleOfThreeOrFive(7);

        assertFalse(isMultipleOfThree);
    }

    @Test
    public void shouldReturnTrueForNumberMultipleOfFive() {

        boolean isMultipleOfFive = multipleOfNumberChecker.isMultipleOfThreeOrFive(10);

        assertTrue(isMultipleOfFive);
    }

    @Test
    public void shouldReturnFalseForNumberNotMultipleOfFive() {

        boolean isMultipleOfFive = multipleOfNumberChecker.isMultipleOfThreeOrFive(11);

        assertFalse(isMultipleOfFive);
    }
}
