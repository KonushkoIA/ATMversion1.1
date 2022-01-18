import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    static boolean flag = true;
    public static void main(String[] args) throws InterruptedException {
        ATM atm = new ATM(50000,true);
        User user = new User("Andrey");
        Card card = new Card(1, user,5000);
        user.setCard(card);
//        Thread myThread = new Thread(new WithdrawalThread(100,atm,card));
//        Thread myThread1 = new Thread(new WithdrawalThread(200,atm,card));
//        Thread myThread2 = new Thread(new WithdrawalThread(300,atm,card));
//        Thread myThread3 = new Thread(new WithdrawalThread(400,atm,card));
//        Thread myThread4= new Thread(new WithdrawalThread(500,atm,card));
//        Thread myThread5 = new Thread(new WithdrawalThread(600,atm,card));
//        myThread.start();
//        Thread.sleep(1);
//        System.out.println(card.getCardMoney());
//        myThread1.start();
//        Thread.sleep(1);
//        System.out.println(card.getCardMoney());
//        myThread2.start();
//        Thread.sleep(1);
//        System.out.println(card.getCardMoney());
//        myThread3.start();
//        Thread.sleep(1);
//        System.out.println(card.getCardMoney());
//        myThread4.start();
//        Thread.sleep(1);
//        System.out.println(card.getCardMoney());
//        myThread5.start();
//        Thread.sleep(1);
//        System.out.println(card.getCardMoney());
        System.out.println("1. Снять деньги");
        System.out.println("2. Посмотреть остаток средст на карте");
        System.out.println("3. Закончить работу");

        while (flag){
            System.out.println("Введите номер желаемого дествия:");
            Menu menu = new Menu();
            menu.choice(card, atm);
            try{
                Thread.sleep(1);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
