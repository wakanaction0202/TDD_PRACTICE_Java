package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * - [ ] $5 + 10chf = $10 (レートが2:1の場合)
 * - [x] $5 * 2 = 10
 * - [x] amount をprivateにする
 * - [x] Dollarの副作用どうする？
 * - [ ] Moneyの丸め処理どうする？
 * - [x] equals()
 * - [ ] hashCode()
 * - [ ] nullとの比較
 * - [ ] 他のオブジェクトとの等価性比較
 * - [x] **5CHF * 2 = 10CHF**
 * - [ ] DollarとFrancの重複
 * - [x] equalsの一般化
 * - [ ] timesの一般化
 * - [x] Franc と Dollarを比較する
 * - [ ] 通貨の概念
 * - [ ] testFrancMultiplicationを削除する？
 */
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
