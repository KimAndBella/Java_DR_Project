package Exception;

/**
 * Created by pan.sun on 2017/4/11.
 */
public class InvalidNodeException extends RuntimeException {
    public InvalidNodeException(String err){
        super(err);
    }
}
