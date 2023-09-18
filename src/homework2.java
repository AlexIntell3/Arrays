import java.util.Arrays;
public class homework2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        int[] spending = generateRandomArray();
        System.out.println(Arrays.toString(spending));
        int sum = 0;
        for (int i = 0; i < spending.length; i++) {
            sum = sum + spending[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    private static void task2() {
        int[] spending = generateRandomArray();
        System.out.println(Arrays.toString(spending));
        int min = spending[0];
        int max = spending[0];
        for (int spend : spending) {
            if (spend < min) {
                min = spend;
            }
            if (spend > max) {
                max = spend;
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей. Максимальная сумма трат за месяц составила " + max + " рублей.");
    }

    private static void task3() {
        int[] spending = generateRandomArray();
        System.out.println(Arrays.toString(spending));
        int sum = 0;
        for (int i = 0; i < spending.length; i++) {
            sum = sum + spending[i];
        }
        double average = (double) sum / spending.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }


    private static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'i'};
        for (int start = 0, end = reverseFullName.length - 1; start < end; start++, end--) {
            char temp = reverseFullName[start];
            reverseFullName[start] = reverseFullName[end];
            reverseFullName[end] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}




