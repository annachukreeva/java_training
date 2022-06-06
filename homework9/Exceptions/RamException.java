package homework.homework9.Exceptions;

public class RamException extends Exception {
    public RamException() {
    }

    public RamException(String message) {
        super(message);
    }

    public RamException(String message, Throwable cause) {
        super(message, cause);
    }

    public RamException(Throwable cause) {
        super(cause);
    }

    public RamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
