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
 * - [ ] Franc と Dollarを比較する
 * - [ ] 通貨の概念
 */
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
