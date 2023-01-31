import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException, IOException {
        String Opener = null;
        while (true){
        Scanner input = new Scanner(System.in);
        System.out.print("что хотите открыть?\nВведите название процесса: ");
        Opener = input.nextLine(); // считываение команды
        Runtime.getRuntime().exec(Opener); // открытие
        }
    }
}
