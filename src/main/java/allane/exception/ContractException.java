package allane.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class ContractException extends RuntimeException{

    private String message;

    public ContractException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
