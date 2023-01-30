public class Main {
    public static void main(String[] args) {
        for(byte i = 0; i <= 10; i++){
            System.out.println('213');
            for(byte g = 0; g <= 10; g++){
                System.out.printf("%d * %d = %d",i,g,(i*g));
                System.out.println("");
            }
            System.out.println("=========");
        }
    }
}

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException, IOException {
        String Opener = null;
        System.out.print("что хотите открыть?\nВведите название процесса: ");
        while (true){
        Scanner input = new Scanner(System.in);
        Opener = input.nextLine(); // считываение команды
        Runtime.getRuntime().exec(Opener); // открытие
        }
    }
}
