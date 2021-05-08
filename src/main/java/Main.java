import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();


        System.out.println("Введите имя первого игрока!");
        Scanner scanner = new Scanner(System.in);
        String firstGamer = scanner.nextLine();
        System.out.println("Введите имя второго игрока!");
        String secondGamer = scanner.nextLine();
        int firstGamerSchot = 0;
        int secondGamerSchot = 0;
        while (firstGamerSchot < 3 || secondGamerSchot < 3)
        {
            System.out.println("Играет " + firstGamer);
            int number = scanner.nextInt();
            int num = random.nextInt(4);
            if (number == num){
                firstGamerSchot++;
                System.out.println("Молодец " + firstGamer + ", Твоя очко: " + firstGamerSchot);
                if (firstGamerSchot == 3){
                    System.out.println(firstGamer + " вы чемпион" + "\n" + "Очко " + secondGamer + " - " + secondGamerSchot);
                    break;
                }
            }else {
                System.out.println("не угодали");
            }
            System.out.println("Играет " + secondGamer);
            int number2 = scanner.nextInt();
            int num2 = random.nextInt(4);
            if (number2 == num2) {
                secondGamerSchot++;
                System.out.println("Молодец "+ secondGamer + ", Твоя очко: " + secondGamerSchot);
                if (secondGamerSchot == 3){
                    System.out.println(secondGamer + " вы чемпион" + "\n" + "Очко " + firstGamer + " - " +  firstGamerSchot);
                    break;
                }
            }else {
                System.out.println("не угодали" );
        }
    }
}}
