package tp_exception;

import java.io.IOException;

public class BadDataException extends IOException {

    private static final long serialVersionUID = 1L;

    public BadDataException(String message) {
        super(message);
    }

}
