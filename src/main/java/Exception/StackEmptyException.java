package Exception;

/**
 * Created by pan.sun on 2017/4/12.
 */
public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String err){
        super(err);
    }
}
