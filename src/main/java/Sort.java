import java.util.Scanner;

class InsertionSort {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Какой длины вы хотите, чтобы ваш массив был? ");
        int arraySize = console.nextInt();
        String a[] = arrayOfStrings(arraySize);
        System.out.println("Вот отсортированные данные:");
        insert(a, arraySize);


    }

    public static String[] arrayOfStrings(int size) {
        String a[] = new String[size];
        int i = 0;

        do {
            System.out.print("Введите строку: ");
            String input = console.next();

            input = a[i];
            i++;

        } while(i < size);

        return a;
    }

    public static void insert(String[] a, int arraySize) {

        String temp = a[a.length-1];
        int j = a.length - 1;

        while (j >= 0 && a[j].compareToIgnoreCase(temp) > 0 ) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = temp;
    }
}