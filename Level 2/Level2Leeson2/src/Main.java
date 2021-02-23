
public class Main {

    public static void main(String[] args) {
    String[][] array = {{"8","47","54","54"},
                        {"79","19","31","54"},
                        {"32","57","94","72"},
                        {"83","82","94","36"}};
        try {
            try {
                int result = method(array);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не верен. Должен быть 4х4");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива. Должны быть цифры");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }
    public static int method(String[][] array) throws MyArraySizeException, MyArrayDataException{
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
