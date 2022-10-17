// Вывести все простые числа от 1 до 1000

package Homework;

public class task2 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.printf("2 ");
        for (int i = 3; i < n; i += 2) {
            boolean isSimple = true;
            for (int j = 3; j < i / 2; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.printf("%d ", i);
            }
        }
    }
}
