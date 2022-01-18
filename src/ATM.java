public class ATM {
    private int atmMoney;
    private boolean workingCapacity;

    public ATM() {
    }

    public ATM(int atmMoney, boolean workingCapacity) {
        this.atmMoney = atmMoney;
        this.workingCapacity = workingCapacity;
    }

    public int getAtmMoney() {
        return atmMoney;
    }

    public void setAtmMoney(int atmMoney) {
        this.atmMoney = atmMoney;
    }

    public boolean isWorkingCapacity() {
        return workingCapacity;
    }

    public void setWorkingCapacity(boolean workingCapacity) {
        this.workingCapacity = workingCapacity;
    }
}
