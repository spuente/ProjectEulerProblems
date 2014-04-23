package spuente.projecteuler.app;

import spuente.projecteuler.MultiplesOfThreeAndFiveAdder;

/**
 * Created by spuente on 23/04/14.
 */
public class Application {

    public static void main(String args[]) {

        MultiplesOfThreeAndFiveAdder multiplesOfThreeAndFiveAdder = new MultiplesOfThreeAndFiveAdder();
        int result = multiplesOfThreeAndFiveAdder.addNumbersUpTo(1000);

        System.out.printf("The sum of numbers multiple of 3 and 5 up to 1000 is %d\n", result);
    }
}
