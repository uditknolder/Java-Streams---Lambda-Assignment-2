package Assignment;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    static int num;
    static boolean flag = false;

    public static void main(String[] args) {
        Interface obj = (num) -> {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.println(num+" is prime number ");
            else
                System.out.println(num+" is Not a prime number ");

        };

        Random rand = new Random();

        //List<Integer> list = Arrays.asList(1, 2, 13, 3, 4, 5, 45, 34, 3, 11);
        for (int j = 0; j <5; j++) {
            int num = rand.nextInt(100);

            obj.check(num);
        }


    }

}
