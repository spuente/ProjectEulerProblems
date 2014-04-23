package spuente.projecteuler;

/**
 * Created by spuente on 23/04/14.
 */
public class MultiplesOfThreeAndFiveAdder {

    private MultipleOfNumberChecker multipleOfNumberChecker;

    public MultiplesOfThreeAndFiveAdder() {

        multipleOfNumberChecker = new MultipleOfNumberChecker();
    }

    public int addNumbersUpTo(int number) {

        int result = 0;

        for (int i = 1; i < number; i++) {
            if (multipleOfNumberChecker.isMultipleOfThreeOrFive(i)) {
                result += i;
            }
        }
        return result;
    }
}
