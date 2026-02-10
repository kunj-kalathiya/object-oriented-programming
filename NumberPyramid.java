public class NumberPyramid {
    public static void main(String[] args) {

        int rows = 8;

        for (int i = 0; i < rows; i++) {

            // Print leading spaces
            for (int space = rows - i; space > 1; space--) {
                System.out.print("    ");
            }

            // Left side
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", num);
                num *= 2;
            }

            // Right side
            num /= 4;
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", num);
                num /= 2;
            }

            System.out.println();
        }
    }
}