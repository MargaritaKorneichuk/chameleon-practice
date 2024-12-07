package org.example.steps;

import io.cucumber.java.ru.И;
import org.springframework.beans.factory.annotation.Autowired;
import ru.ibsqa.chameleon.steps.AbstractSteps;

public class ExceptionStepStory extends AbstractSteps {
    @Autowired
    private ExceptionStep exceptionStep;

    @И("выброшено исключение")
    public void выброшено_исключение(){
        flow(() -> exceptionStep.throwing());
    }
}
