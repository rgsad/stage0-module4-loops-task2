package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive) {
            if (counter < 8 && counter != 4 && counter != 6) {
                System.out.println(counter);
            }
            if (counter % 2 != 0 && counter % 3 != 0 && counter % 5 != 0 && counter % 7 != 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
