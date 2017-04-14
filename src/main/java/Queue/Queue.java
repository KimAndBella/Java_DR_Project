package Queue;
import Exception.*;
/**
 * Created by pan.sun on 2017/4/13.
 */
public interface Queue {
    public int getSize();
    public boolean isEmpty();
    public void enQueue(Object data);
    public Object deQueue() throws QueueEmptyException;
    public Object peek() throws QueueEmptyException;
    public void print();
}
