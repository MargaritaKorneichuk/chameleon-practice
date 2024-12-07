package org.example.steps;

import org.junit.jupiter.api.Assertions;
import org.springframework.stereotype.Component;
import ru.ibsqa.chameleon.steps.TestStep;

@Component
public class ExceptionStep {
    @TestStep("выброшено исключение")
    public void throwing(){
        DuplicateProductException exception = Assertions.assertThrows(DuplicateProductException.class, () ->{
            throw new DuplicateProductException("Дубликат товара найден в базе данных");
        });
        Assertions.assertTrue(exception.getMessage().contains("Дубликат"));
    }
    public class DuplicateProductException extends Exception {
        public DuplicateProductException(String message) {
            super(message);
        }
    }
}
