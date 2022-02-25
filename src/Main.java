import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    static boolean flag = true;
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(RootConfiguration.class);
        System.out.println("1. Снять деньги");
        System.out.println("2. Посмотреть остаток средст на карте");
        System.out.println("3. Закончить работу");

        while (flag){
            System.out.println("Введите номер желаемого дествия:");
            Menu menu = new Menu();
            Card card = container.getBean(Card.class);
            ATM atm = container.getBean(ATM.class);
            menu.choice(card, atm);
            try{
                Thread.sleep(1);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
