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
    }
}
