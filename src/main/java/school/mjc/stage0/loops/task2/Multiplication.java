package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = multiplyByAndToInclusive == 0 ? 1 : 0;
        int endOfRange = multiplyByAndToInclusive < 0 ? -multiplyByAndToInclusive : multiplyByAndToInclusive;
        while (counter < endOfRange + 1) {
            System.out.println(multiplyByAndToInclusive * counter);
            counter++;
        }
    }
}
