package calculator_project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperation extends RuntimeException {

    private static final long serialVersionUID = 2403402355699411255L;

    public UnsupportedMathOperation(String e) {
        super(e);
    }
}
