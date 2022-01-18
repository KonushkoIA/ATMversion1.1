public class Card {
    private int cardNumber;
    private String owner;
    private static int cardMoney;

    public Card( int cardNumber, User user, int cardMoney) {
        this.cardNumber = cardNumber;
        this.owner = user.getName();
        this.cardMoney = cardMoney;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCardMoney() {
        return cardMoney;
    }

    public void setCardMoney(int cardMoney) {
        this.cardMoney = cardMoney;
    }

//    public void withdrawMoney(int desiredAmount, ATM atm) {
//        if (desiredAmount <= getCardMoney() && desiredAmount <= atm.getAtmMoney()) {
//            System.out.println("Деньги сняты");
//            cardMoney = cardMoney - desiredAmount;
//        } else if (desiredAmount > getCardMoney()) {
//            try {
//                throw new LackMoneyException();
//            } catch (LackMoneyException e) {
//                System.out.println("Недостаточно средст на карте");
//            }
//        } else if (desiredAmount > atm.getAtmMoney()) {
//            try {
//                throw new LackMoneyException();
//            } catch (LackMoneyException e) {
//                System.out.println("Недостаточно средст в банкомате");
//            }
//        }
//    }

    public void seeAccountBalance() {
        System.out.println(getCardMoney());
    }
}
