import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AbsoluteNumberTest {
    @Test
    void findAbsoluteNumber0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumber.findAbsoluteNumber(number);
        assertEquals(expected, result);
    }
    @Test
    void findAbsoluteNumberNegative1() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumber.findAbsoluteNumber(number);
        assertEquals(expected, result);
    }
}