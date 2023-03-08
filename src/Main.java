import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int scanNumber = scanner.nextInt();
        if (scanNumber==1){
            hello();
        } else if (scanNumber==0) {
            bay();
        }else
            System.out.println("вывели неправылный цифра ");
    }
    public static void hello (){
        System.out.println("салам");
    }
    public static void bay (){
        System.out.println("корушкончо");

    }
}