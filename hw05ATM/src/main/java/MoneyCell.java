public class MoneyCell {

    private Banknote banknote;
    private int count;

    public MoneyCell(Banknote banknote, int count) {
        this.banknote = banknote;
        this.count = count;
    }

    public Banknote getBanknote() {
        return banknote;
    }

    public void setBanknote(Banknote banknote) {
        this.banknote = banknote;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }
}
