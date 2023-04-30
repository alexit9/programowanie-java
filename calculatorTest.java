import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    @Test
public void shouldReturn30WhenAdding10And20() {
    //given
    calculator calculator = new calculator();
    //when
    final int result = calculator.add(10, 20);
    //then
    assertEquals(30, result);
}
}