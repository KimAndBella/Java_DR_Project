package Link;

/**
 * Created by pan.sun on 2017/4/11.
 */
public class SLNode implements Node {
    private Object element;
    private SLNode next;
    public SLNode(Object ele,SLNode next){
        this.element = ele;
        this.next = next;
    }
    public SLNode(){
        this(null,null);
    }
    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }

    public Object getData() {
        return element;
    }

    public void setData(Object data) {
        this.element = data;
    }
}
