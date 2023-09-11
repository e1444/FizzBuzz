public class Multiples {
    public static void main(String[] args) {
        int acc = 1;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 + i % 5 == 0) {
                acc += 1;
            }
        }

        System.out.println(acc);
    }
}
