package Link;
import Exception.*;
/**
 * Created by pan.sun on 2017/4/11.
 */
public class LinkedListIterator implements Iterator {
    private LinkedList linkedList;
    private Node current;
    public LinkedListIterator(LinkedList linkedList){
        this.linkedList = linkedList;
        if(linkedList.isEmpty()){
            current = null;
        }else{
            current = linkedList.getFirst();
        }
    }
    public void first() {
        if(linkedList.isEmpty()){
            current = null;
        }else{
            current = linkedList.getFirst();
        }
    }

    public void next() throws OutOfBoundaryException {
        if(isDone()){
            throw new OutOfBoundaryException("错误：没有元素了");
        }
        if(current == linkedList.getLast()){
            current = null;
        }else{
            current = linkedList.getNext(current);
        }
    }

    public boolean isDone() {
        return current==null;
    }

    public Object currentItem() {
        if(isDone()){
            throw new OutOfBoundaryException("错误：已经没有元素");
        }
        return current.getData();
    }
}
