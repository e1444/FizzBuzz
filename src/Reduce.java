public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int steps = 0;

        while (i != 0) {
            if (i % 2 == 0) {
                i = Math.floorDiv(i, 2);
            }
            else {
                i -= 1;
            }
            steps += 1;
        }

        System.out.println(steps);
    }
}
