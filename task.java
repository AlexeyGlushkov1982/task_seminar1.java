// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
// int i = new Random().nextInt(k); //это кидалка случайных чисел!)
package seminar_1;

import java.util.Arrays;
import java.util.Random;

/**
 * task
 */
public class task {

    public static void main(String[] args) {
        int i_random = new Random().nextInt(32500, 32767);
        int n = Integer.toBinaryString(i_random).length();
        short i_max = Short.MAX_VALUE;
        short i_min = Short.MIN_VALUE;
        System.out.println("Случайное число: i = " + i_random);
        System.out.println("Двоичный код случайного числа: " + Integer.toBinaryString(i_random));
        System.out.println("Старший разряд: n = " + n);
        System.out.println("MAX_VALUE: " + i_max);
        System.out.println("MIN_VALUE: " + i_min);

        int size = 0;

        for (int x = i_random; x < i_max; x++) {
            if (x % n == 0) {
                System.out.println(x);
                size++;
            }
        }
        System.out.println("Размер массива size = " + size);
        
        int[] array = new int[size];

        for (int i = i_random, index = 0; i < i_max; i++) {
            if (i % n == 0) {
                array[index] = i;
                index++;
            }
        }
        System.out.println("Готовый массив: " + (Arrays.toString(array)));
    }
}