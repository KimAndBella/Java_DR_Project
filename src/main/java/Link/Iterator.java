package Link;
import Exception.*;
/**
 * Created by pan.sun on 2017/4/11.
 */
public interface Iterator {
    public void first();
    public void next() throws OutOfBoundaryException;
    //判断是否完成查找
    public boolean isDone() ;
    public Object currentItem() throws OutOfBoundaryException;
}
