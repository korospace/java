package B8.arraysClass;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] number = {4,1,3,2,10,6,8,9,5,7};

        Arrays.sort(number);

        System.out.println(Arrays.toString(number));

        System.out.println(Arrays.binarySearch(number,10)); // return index

        int[] copy1 = Arrays.copyOf(number,5);
        System.out.println(Arrays.toString(copy1));

        int[] copy2 = Arrays.copyOfRange(number,4,10);
        System.out.println(Arrays.toString(copy2));

    }
}
