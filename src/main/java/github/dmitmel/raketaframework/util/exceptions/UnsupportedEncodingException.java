package github.dmitmel.raketaframework.util.exceptions;

/**
 * {@link java.io.UnsupportedEncodingException}
 */
public class UnsupportedEncodingException extends RuntimeException {
    public UnsupportedEncodingException() {
    }

    public UnsupportedEncodingException(String message) {
        super(message);
    }

    public UnsupportedEncodingException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedEncodingException(Throwable cause) {
        super(cause);
    }

    public static UnsupportedEncodingException extractFrom(java.io.UnsupportedEncodingException e) {
        return new UnsupportedEncodingException(e.getMessage(), e.getCause());
    }
}
