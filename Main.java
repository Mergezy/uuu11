import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
        public static void main(String[] args) throws IOException {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int number = input.nextInt();
            int[] array = new int[number];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random()*200);
//                System.out.printf("Введите %d элемент: ", i + 1);
//                array[i] = input.nextInt();
//                System.out.println();
            }
            System.out.println(Arrays.toString(array));
            System.out.println("Виды возможных сортировок:\n" +
                    "1,1 Сортировка пузырьком(возрастание) || 1,2 Сортировка пузырьком(убывание)\n" +
                    "2,1 Быстрая сортировка(возрастание)   || 2,2 Быстрая сортировка(убывание)\n" +
                    "3,1 Cортировки выбором(возрастание)   || 3,2 Cортировки выбором(убывание)\n" +
                    "4,1 Cортировки вставками(возрастание) || 4,2 Cортировки вставками(убывание)\n");
            while (true){
            double answer = input.nextDouble();
            if (answer  == 1.1) {
                bublleSort.increase(array);
                System.out.println(Arrays.toString(array));
               } else if (answer  == 1.2) {
                bublleSort.descending(array);
                System.out.println(Arrays.toString(array));
            } else if (answer > 1.2 && answer < 2.1) {
                System.out.println("ОШИБКА!\nВы ввели не верный код!");
            }
            if (answer == 2.1){int high = array.length-1;
                qSort.increase(array,0,high);
                System.out.println(Arrays.toString(array));
            } else if (answer == 2.2) {
                int high = array.length-1;
                qSort.descending(array,0,high);
                System.out.println(Arrays.toString(array));
            } else if (answer > 2.2 && answer < 3.1) {
                System.out.println("ОШИБКА!\nВы ввели не верный код!");
            }
            if (answer == 3.1){
                selectionSort.increase(array);
                System.out.println(Arrays.toString(array));
                } else if (answer == 3.2) {
                selectionSort.descending(array);
                System.out.println(Arrays.toString(array));
                } else if (answer > 3.2 && answer < 4.1) {
                    System.out.println("ОШИБКА!\nВы ввели не верный код!");
                }
            if (answer == 4.1){
                insertSort.increase(array);
                System.out.println(Arrays.toString(array));
                } else if (answer == 4.2) {
                insertSort.descending(array);
                System.out.println(Arrays.toString(array));
                } else if (answer > 4.2) {
                    System.out.println("ОШИБКА!\nВы ввели не верный код!");
                }
            }
}
class bublleSort{
    static void increase(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
    static void descending(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
class qSort {
            static void increase(int[] array,int low, int high){
                if (low >= high) return;
                int middle = low + (high - low)/2;
                int opora = array[middle];

                int i = low, j = high;
                while ( i <= j){
                    while (array[i] < opora){
                        i++;
                    }
                    while (array[j] > opora){
                        j--;
                    }
                    if (i <= j){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        i++;
                        j--;
                    }
                }
                if(low < j){increase(array, low, j);}
                if (high > i) increase(array, i, high);
            }
            static void descending(int[] array,int low, int high){
                if (low >= high) return;

                int middle = low + (high - low)/2;
                int opora = array[middle];

                int i = low, j = high;
                while ( i <= j){
                    while (array[i] > opora){
                        i++;
                    }
                    while (array[j] < opora){
                        j--;
                    }
                    if (i <= j){
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                        i++;
                        j--;
                    }
                }
                if(low < j){descending(array, low, j);}
                if (high > i) descending(array, i, high);
            }

}
class selectionSort{
     static void increase(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minId = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {//поиск наименьшего элемента
                if (array[j] < min) {
                    minId = j;//индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[minId] = array[i];//меняем значения наименьшего с нынешним эллементом
            array[i] = min;
        }
    }
     static void descending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minId = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {//поиск наименьшего элемента
                if (array[j] > min) {
                    minId = j;//индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[minId] = array[i];//меняем значения наименьшего с нынешним эллементом
            array[i] = min;
        }
    }

}
class insertSort{
        static void increase(int[] array) {
            int j;//сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
            for (int i = 1; i < array.length; i++) {
                int swap = array[i];//сохраняем ссылку на индекс предыдущего элемента
                for (j = i; j > 0 && swap < array[j - 1]; j--) {//элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                    array[j] = array[j - 1];
                }
                array[j] = swap;
            }
        }
        static void descending(int[] array) {
            //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
            for (int i = 1; i < array.length; i++) {
                int swap = array[i];//сохраняем ссылку на индекс предыдущего элемента
                for (i = i; i > 0 && swap > array[i - 1]; i--) {//элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                    array[i] = array[i - 1];
                }
                array[i] = swap;
            }
        }
    }
}

