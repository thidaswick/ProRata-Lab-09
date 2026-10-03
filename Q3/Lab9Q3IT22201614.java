public class Lab9Q3IT22201614 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int result1;
        int result2;

        int part1 = multiply(3, 4);
        int part2 = multiply(5, 7);
        int sum1 = add(part1, part2);

        result1 = square(sum1);

        int sum2 = add(4, 7);
        int sum3 = add(8, 3);

        result2 = add(square(sum2), square(sum3));

        System.out.println("Result of (3 * 4 + 5 * 7)^2     : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + result2);
    }
}
