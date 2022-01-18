public class WithdrawalThread implements Runnable{
    private int desiredAmount;
    private ATM atm;
    private Card card;
    private Manager manager = new Manager();

    public WithdrawalThread(int desiredAmount, ATM atm, Card card) {
        this.desiredAmount = desiredAmount;
        this.atm = atm;
        this.card = card;
    }

    public int getDesiredAmount() {
        return desiredAmount;
    }

    public void setDesiredAmount(int desiredAmount) {
        this.desiredAmount = desiredAmount;
    }

    public ATM getAtm() {
        return atm;
    }

    public void setAtm(ATM atm) {
        this.atm = atm;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public void run() {
        manager.getMoney(this.card, this.atm, this.desiredAmount);
//            if (desiredAmount <= card.getCardMoney() && desiredAmount <= atm.getAtmMoney()) {
//                int cardMoney = card.getCardMoney();
//                cardMoney = cardMoney - desiredAmount;
//                card.setCardMoney(cardMoney);
//                System.out.println("Деньги сняты");
//            } else if (desiredAmount > card.getCardMoney()) {
//                try {
//                    throw new LackMoneyException();
//                } catch (LackMoneyException e) {
//                    System.out.println("Недостаточно средст на карте");
//                }
//            } else if (desiredAmount > atm.getAtmMoney()) {
//                try {
//                    throw new LackMoneyException();
//                } catch (LackMoneyException e) {
//                    System.out.println("Недостаточно средст в банкомате");
//                }
//            }

    }
//    public void withdrawMoney(int desiredAmount, ATM atm, Card card){
//        if (desiredAmount <= card.getCardMoney() && desiredAmount <= atm.getAtmMoney()) {
//            System.out.println("Деньги сняты");
//            int cardMoney = card.getCardMoney();
//            cardMoney = cardMoney - desiredAmount;
//            card.setCardMoney(cardMoney);
//        } else if (desiredAmount > card.getCardMoney()) {
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
}
