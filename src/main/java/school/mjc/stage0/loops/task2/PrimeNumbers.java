package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive > 1) {
            int count = 2;
            while (count <= printToInclusive) {
                if (count == 2 || count == 3 || count == 5 || count == 7) {
                    System.out.println(count);
                }
                if (count > 10 && count % 2 != 0 && count % 3 != 0 && count % 5 != 0 && count % 7 != 0) {
                    System.out.println(count);
                }
                count++;
            }
        }
    }
}
