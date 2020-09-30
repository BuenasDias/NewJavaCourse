import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {

        String[] arr = {"First", "Second"};

        Random random = new Random();
        System.out.println(arr[random.nextInt(arr.length)]);
    }
}
