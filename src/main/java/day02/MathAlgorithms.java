package day02;

public class MathAlgorithms {

    public int findBiggestCommonDivider(int firstInt, int secondInt) {
        for (int i = Math.min(firstInt, secondInt); i != 1; i--) {
            if (firstInt % i == 0 && secondInt % i == 0) {
                return i;
            }
        }
        return 1;
    }

}
