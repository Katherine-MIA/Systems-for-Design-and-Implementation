package exceptions;

public class RpcException extends RuntimeException {
    public RpcException(String msg) {
        super(msg);
    }

    public RpcException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
