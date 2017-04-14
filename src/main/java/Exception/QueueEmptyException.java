package Exception;

/**
 * Created by pan.sun on 2017/4/13.
 */
public class QueueEmptyException extends RuntimeException {
    public QueueEmptyException(String err){
        super(err);
    }
}
