import java.util.concurrent.ExecutionException;

public class ParametrosInvalidosException extends ExecutionException {

    public ParametrosInvalidosException(String message){
        super(message);
    }
}
