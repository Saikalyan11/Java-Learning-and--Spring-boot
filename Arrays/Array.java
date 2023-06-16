package Arrays;

public class Array {
    public static void main(String a[]) {

        // Static Array
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 10, 12, 13 };

        for (int i = 0; i <= nums.length; i++)
            System.out.println(nums[i]);

        // Dynamic Array

        int numbers[] = new int[4];
        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 50;
        numbers[3] = 100;

        for (int i = 0; i <= numbers.length; i++)
            System.out.println(numbers[i]);

    }
}
