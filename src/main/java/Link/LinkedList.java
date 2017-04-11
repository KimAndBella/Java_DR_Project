package Link;
import Exception.*;
/**
 * Created by pan.sun on 2017/4/11.
 */
public interface LinkedList {
    public int getSize();
    public boolean isEmpty();
    public Node getFirst() throws OutOfBoundaryException;
    public Node getLast() throws OutOfBoundaryException;
    public Node getNext(Node p) throws InvalidNodeException,OutOfBoundaryException;
    public Node getPre(Node p) throws InvalidNodeException,OutOfBoundaryException;
    public Node insertFirst(Object data);
    public Node insertLast(Object data);
    public Node insertAfter(Node p,Object data) throws  InvalidNodeException;
    public Node insertBefore(Node p,Object data) throws  InvalidNodeException;
    public Object remove(Node p )throws InvalidNodeException;
    public Object removeFirst() throws OutOfBoundaryException;
    public Object removeLast() throws OutOfBoundaryException;
    public Object replace(Node p,Object e)throws InvalidNodeException;
    public Iterator elements();




}
