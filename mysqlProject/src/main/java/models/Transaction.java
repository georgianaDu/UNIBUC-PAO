package models;

public class Transaction implements Comparable {

    private String merchant;
    private double amount;
    private Card card;

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "merchant='" + merchant + '\'' +
                ", amount=" + amount +
                ", card=" + card +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Transaction transaction = (Transaction) o;
        return Double.compare(this.getAmount(), transaction.getAmount());
    }
}
