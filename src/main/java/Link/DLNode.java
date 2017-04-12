package Link;

/**
 * Created by pan.sun on 2017/4/11.
 */
public class DLNode implements Node {
    private Object object;
    private DLNode pre;
    private DLNode next;
    public DLNode(){
        this(null,null,null);
    }
    public DLNode(Object object,DLNode pre,DLNode next){
        this.object = object;
        this.pre = pre;
        this.next = next;
    }
    public DLNode getPre() {
        return pre;
    }

    public void setPre(DLNode pre) {
        this.pre = pre;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }

    public Object getData() {
        return this.object;
    }

    public void setData(Object data) {
        this.object = data;
    }
}
