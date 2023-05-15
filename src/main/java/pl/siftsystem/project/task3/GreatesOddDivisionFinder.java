package pl.siftsystem.project.task3;

public class GreatesOddDivisionFinder {
    public static void calculateGreatestOddDivisorIterative(int number) {
        if (number < 1 || number >= 106) {
            throw new IllegalArgumentException("number shoud be : (0 < n < 106).");
        }

        if (number % 2 == 0) {
            number /= 2;
        }
        while (number % 2 == 0) {
            number /= 2;
        }
        System.out.println(number+"/n"+number);
    }
}
