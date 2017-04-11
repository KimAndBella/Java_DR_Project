package Link;
import Exception.OutOfBoundaryException;
/**
 * Created by pan.sun on 2017/4/11.
 */
public interface List {
    //返回list size
    public int getSize();

    //判断是否为空
    public boolean isEmpty();

    public int indexOf(Object ele);
    public void insert(int i,Object ele) throws OutOfBoundaryException;
    public boolean insertBefore(Object data,Object ele);
    public boolean insertAfter(Object data,Object ele);
    public Object remove(int i) throws OutOfBoundaryException;
    public boolean remove(Object ele);
    public Object replace(int i,Object ele) throws  OutOfBoundaryException;
    public Object get(int i) throws OutOfBoundaryException;
    public boolean contains(Object data);
}
