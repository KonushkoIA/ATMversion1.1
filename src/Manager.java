public class Manager {
    public synchronized void getMoney(Card card, ATM atm, int desiredAmount) {
        if (desiredAmount <= card.getCardMoney() && desiredAmount <= atm.getAtmMoney()) {
            int cardMoney = card.getCardMoney();
            cardMoney = cardMoney - desiredAmount;
            card.setCardMoney(cardMoney);
            System.out.println("Деньги сняты");
        } else if (desiredAmount > card.getCardMoney()) {
            try {
                throw new LackMoneyException();
            } catch (LackMoneyException e) {
                System.out.println("Недостаточно средст на карте");
            }
        } else if (desiredAmount > atm.getAtmMoney()) {
            try {
                throw new LackMoneyException();
            } catch (LackMoneyException e) {
                System.out.println("Недостаточно средст в банкомате");
            }
        }
    }
}
