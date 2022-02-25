public class Card {
    private int cardNumber;
    private String owner;
    private static int cardMoney;

    public Card( int cardNumber, User user, int cardMoney) {
        this.cardNumber = cardNumber;
        this.owner = user.getName();
        Card.cardMoney = cardMoney;
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
        Card.cardMoney = cardMoney;
    }

    public void seeAccountBalance() {
        System.out.println(getCardMoney());
    }
}
