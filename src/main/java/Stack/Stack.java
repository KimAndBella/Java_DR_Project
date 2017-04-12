package Stack;
import Exception.*;
/**
 * Created by pan.sun on 2017/4/12.
 */
public interface Stack {
    public int getSize();
    public void push(Object data);
    public Object pop() throws StackEmptyException;
    public boolean isEmpty() ;
    public Object peek() throws StackEmptyException;
    public void print();
}
