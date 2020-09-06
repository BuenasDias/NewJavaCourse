package LessonComparisonOperation;

public class ComparisonOperation {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 10;

        // Далее опробуем операции сравнения на практике

        System.out.println(a > b); // true
        System.out.println(a > c); // false

        System.out.println(a < b); // false
        System.out.println(a < c); // false

        System.out.println(a == c); // true
        System.out.println(a == b); // false

        System.out.println(a != b); // true

        System.out.println(a >= c); // true

        System.out.println(a <= b); // false

    }
}
