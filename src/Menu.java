public class Menu {
    int num1 = getInt();

    public int getInt(){
        int num;
        try{
            String enteredValue = Main.scanner.nextLine();
            num = Integer.parseInt(enteredValue);
            if (num <= 0) {
                System.out.println("Вы ввели некорректные данные");
                System.out.println("Введите сумму заново");
                num = getInt();
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            num = getInt();
        }
        return num;
    }

    public int getInt1(){
        int num;
        try{
            System.out.println("Введите желаемую сумму");
            String enteredValue = Main.scanner.nextLine();
            num = Integer.parseInt(enteredValue);
            if (num <= 0) {
                System.out.println("Вы ввели некорректные данные");
                System.out.println("Введите сумму заново");
                num = getInt1();
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            num = getInt1();
        }
        return num;
    }

    public void choice(Card card, ATM atm) {
        if (num1 == 1) {
            Thread myThread = new Thread(new WithdrawalThread(getInt1(),atm,card));
            myThread.start();
        }
        else if (num1 == 2) {
            card.seeAccountBalance();
        }
        else if (num1 == 3) {
            Main.flag = false;
            Main.scanner.close();
            System.out.println("Конец работы с банкоматом");
        }
        else {
            System.out.println("Оперции под таким номером не существует");
        }
    }
}
