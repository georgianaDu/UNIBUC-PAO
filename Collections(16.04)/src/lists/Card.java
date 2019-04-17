package lists;

public class Card implements Comparable{

    private String name;
    private double balance;

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
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

    @Override
    public int compareTo(Object o) {

        return (int) this.balance;
    }
}
