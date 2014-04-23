package spuente.projecteuler;

/**
 * Created by spuente on 23/04/14.
 */
public class MultipleOfNumberChecker {

    public boolean isMultipleOfThreeOrFive(int number) {

        return number % 3 == 0 || number % 5 == 0;
    }
}
