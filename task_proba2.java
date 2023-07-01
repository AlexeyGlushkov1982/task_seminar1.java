package seminar_1;

import java.util.Arrays;
import java.util.Random;

public class task_proba2 {
    public static void main(String[] args) {
         short i_max = Short.MAX_VALUE;
        short i_min = Short.MIN_VALUE;

        int i_random = new Random().nextInt(i_min, -32500);
        int n = Integer.toBinaryString(i_random).length();
        
        System.out.println("Случайное число: i = " + i_random);
        System.out.println("Двоичный код случайного числа: " + Integer.toBinaryString(i_random));
        System.out.println("Старший разряд: n = " + n);
        System.out.println("MAX_VALUE: " + i_max);
        System.out.println("MIN_VALUE: " + i_min);

        int size = 0;

        for (int x = i_min; x < i_random; x++) {
            if (x % n != 0) {
                System.out.println(x);
                size++;
            }
        }
        System.out.println("Размер массива size = " + size);
        
        int[] array = new int[size];

        for (int i = i_min, index = 0; i < i_random; i++) {
            if (i % n != 0) {
                array[index] = i;
                index++;
            }
        }
        System.out.println("Готовый массив: " + (Arrays.toString(array)));
    }
}
