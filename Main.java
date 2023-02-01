import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        int randNum = random.nextInt(1 + 100);
        int randIndex = random.nextInt(arr.length + 1);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;//Заполнение массива
//            System.out.println(arr[i]); //Вывод массива(первоначального)
            }
//        System.out.println("NUm "+randIndex+" "+randNum);//Вывод рандомного элемента и индекса
        arr[randIndex] = randNum;
        for (int i = 0; i < arr.length; i++){//Перебор массива
//            System.out.println(arr[i]);//Вывод измененного массива
            for (int j = i+1; j < arr.length;j++){//Сравнение последующих цисел с нынешним
                if(arr[i] == arr[j]){
                    System.out.printf("Повторяющееся число: %d, Индекс: %d \n",arr[i],i);
                }
            }
        }

    }
}

