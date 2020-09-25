import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("1е задание");
        invertArray();
        System.out.println("1е задание другим способом");
        invertArray2();
        System.out.println("2е задание");
        fillArray();
        System.out.println("3е задание");
        changeArray();
        System.out.println("4е задание");
        fillDiagonal();
        System.out.println("5е задание");
        minandmax();

    }
    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    // Тоже  самое первое задание, только попробовал решить другим способом
    public static void invertArray2() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    arr[i] = 1;
                    break;
                case 1:
                    arr[i] = 0;
                    break;
            }
            System.out.println(arr[i]);
        }
    }
    // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.println(arr[i]);
        }
    }
    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray(){
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i=0; i< w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
        }
        for(int i =0; i< w.length; i++) {
                System.out.println(w[i]);
        }
    }
    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    public static void fillDiagonal(){
        int counter = 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter = 1;
            }
            System.out.println();
        }
    }
    // 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета).
    public static void minandmax(){
        int[] arr = {100, 10, 3, 5, -19, 65};
        int min = arr[0];
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
    }
}

