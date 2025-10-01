import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.mentee.power.PalindromeChecker;
import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeCheckerTest {

    @Test
    @DisplayName("Должен вернуть true для палиндрома")
    void shouldReturnTrueForPalindrome() {
        // Arrange & Act & Assert
        assertThat(PalindromeChecker.isPalindrom("А роза упала на лапу Азора")).isTrue();
    }

    @Test
    @DisplayName("Должен вернуть false для не палиндрома")
    void shouldReturnFalseForNonPalindrome() {
        // Arrange & Act & Assert
        assertThat(PalindromeChecker.isPalindrom("Привет мир")).isFalse();
    }

    @Test
    @DisplayName("Должен обработать null входные данные")
    void shouldHandleNullInput() {
        // Arrange & Act & Assert
        assertThat(PalindromeChecker.isPalindrom(null)).isFalse();
    }
}



