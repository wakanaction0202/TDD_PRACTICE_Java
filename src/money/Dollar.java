package money;

public class Dollar extends Money{
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
    String currency() {
        return currency;
    }
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
