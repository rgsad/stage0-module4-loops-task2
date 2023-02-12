package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0) {
            int counter = 0;
            while (counter <= power) {
                System.out.println(1 << counter);
                counter++;
            }
        } else {
            System.out.println("too much power");
        }
    }
}
