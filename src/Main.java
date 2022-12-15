import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int current : arr) {
            sum += current;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minPay = 200001;
        int maxPay = 99999;
        for (int current : arr) {
            if (current < minPay) {
                minPay = current;
            }
            if (current > maxPay) {
                maxPay = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "  + minPay + " рублей. Максимальная сумма трат за день составила " + maxPay + " рублей.");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int current : arr) {
            sum += current;
        }
        double averagePay = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " +averagePay+ " рублей.");
   }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--) {
           char letter = reverseFullName[i];
            System.out.print(letter);
        }
        System.out.println();
    }
}