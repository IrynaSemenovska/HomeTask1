import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayMadness {
    Random random1 = new Random();
    //Task1
    @Test
    public void oddNumbers() {
        int[] array = new int[10];
        for (int i = 0; i < 9; i++) {
            array[0] = 1;
            array[i + 1] = array[i] + 2;
        }
        System.out.println(Arrays.toString(array));
    }

    //Task2
    @Test
    public void changeMinMax() {
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = random1.nextInt(11) - 5;
        }
        System.out.println(Arrays.toString(array1));

        int max = array1[0];
        int imax = 0;
        int min = array1[0];
        int imin = 0;

        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
                imax = i;
            } else {
                if (array1[i] < min) {
                    min = array1[i];
                    imin = i;
                }
            }
        }
        array1[imax] = min;
        array1[imin] = max;
        System.out.println(Arrays.toString(array1));
    }

    //Task3

    @Test
    public void maxCount() {

        int[] array2 = new int[13];
        for (int i = 0; i < 13; i++) {
            array2[i] = random1.nextInt(3) - 1;
        }
        System.out.println(Arrays.toString(array2));

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < 0) {
                count1++;
            }
            else if (array2[i] == 0) {
                count2++;
            } else {
                count3++;
            }
        }
        if (count1 > count2 & count1 > count3) {
            System.out.println("-1:" + count1);
        }
        if (count2 > count1 & count2 > count3) {
            System.out.println("0:" + count2);
        }
        if (count3 > count1 & count3 > count2) {
            System.out.println("1:" + count3);
        }
        if (count1 == count2 & count1 > count3) {
            System.out.println("-1:" + count1);
            System.out.println("0:" + count2);
        }
        if (count1 > count2 & count1 == count3) {
            System.out.println("-1:" + count1);
            System.out.println("1:" + count3);
        }
        if (count2 == count1 & count2 > count3) {
            System.out.println("0:" + count2);
            System.out.println("-1:" + count1);
        }
        if (count2 > count1 & count2 == count3) {
            System.out.println("0:" + count2);
            System.out.println("1:" + count3);
        }
        if (count3 == count1 & count3 > count2) {
            System.out.println("1:" + count3);
            System.out.println("-1:" + count1);
        }
        if (count3 > count1 & count3 == count2) {
            System.out.println("1:" + count3);
            System.out.println("0:" + count2);
        }
        if (count3 == count1 & count3 == count2) {
            System.out.println("1:" + count3);
            System.out.println("-1:" + count1);
            System.out.println("0:" + count2);
        }
    }

    //Task4

    public static void main(String[] args) {
        System.out.println("Please, enter the 5 strings:");
        ArrayList<String> string = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            string.add(scanner.nextLine());
            int length = string.get(i).length();
            if (min > length) {
                min = length;
            }
        }
        for (String s : string) {
            if (s.length()==min)
                System.out.println("The most shorter string: " + s);
        }
    }
}
