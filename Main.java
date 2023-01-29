public class Main {
    public static void main(String[] args) {
        for(byte i = 0; i <= 10; i++){
            for(byte g = 0; g <= 10; g++){
                System.out.printf("%d * %d = %d",i,g,(i*g));
                System.out.println("");
            }
            System.out.println("=========");
        }
    }
}