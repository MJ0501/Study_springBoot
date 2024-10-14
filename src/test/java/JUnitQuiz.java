import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JUnitQuiz {
    @DisplayName("name1,name2,name3은 서로 같은가")
    @Test
    public void junitTest(){
        String name1 = "a";
        String name2 = "a";
        String name3 = "b";
        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();
        assertThat(name1).isEqualTo(name2);
        assertThat(name1).isEqualTo(name3);
    }
    @Test
    public void junitTest2(){
        int number1 = 15;
        int number2 = 0;
        int number3 = -1;

        assertThat(number1).isPositive();
        assertThat(number2).isZero();
        assertThat(number3).isNegative();
        assertThat(number2).isGreaterThan(number2);
        assertThat(number3).isLessThan(number2);
    }

}
