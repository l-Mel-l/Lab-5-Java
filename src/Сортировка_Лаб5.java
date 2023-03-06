import java.util.Scanner;

public class Сортировка_Лаб5 {
    public static void main(String[] args) {

        // Задаётся массив

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите значения массива");
        for (int i = 0; i < n; i++) {
            mass[i] = sc.nextInt();
        }
        sort(mass);
        for (int i = 0; i < n; i++) {
            System.out.println(mass[i]);
        }
    }
        //Сортировочка

        public static void sort(int[]mass){
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = 0; j < mass.length - 1; j++) {
                if (mass[j + 1] < mass[j]) {
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }

        }


    }
}