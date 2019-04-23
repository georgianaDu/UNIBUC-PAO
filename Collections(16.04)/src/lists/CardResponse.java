package lists;

public class CardResponse implements Comparable{

    private String name;
    private double balance;
    private String balanceProvider;

    public CardResponse(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public CardResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBalanceProvider() {
        return balanceProvider;
    }

    public void setBalanceProvider(String balanceProvider) {
        this.balanceProvider = balanceProvider;
    }

    @Override
    public int compareTo(Object o) {

        return (int) this.balance;
    }

    public static CardResponse fromCard(Card card, String balanceProvider){
        CardResponse cardResponse = new CardResponse();

        cardResponse.setBalance(card.getBalance());
        cardResponse.setName(card.getName());
        cardResponse.setBalanceProvider(balanceProvider);

        return cardResponse;

    }

    @Override
    public String toString() {
        return "CardResponse{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", balanceProvider='" + balanceProvider + '\'' +
                '}';
    }
}
