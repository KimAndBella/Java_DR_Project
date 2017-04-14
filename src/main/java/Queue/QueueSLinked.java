package Queue;
import Exception.*;
import Link.SLNode;

/**
 * Created by pan.sun on 2017/4/13.
 */
public class QueueSLinked implements Queue {
    private SLNode front;
    private SLNode rare;
    private int size;
    public QueueSLinked(){
        front = new SLNode();
        rare = front;
        size = 0;
    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void enQueue(Object data) {
        SLNode p = new SLNode(data,null);
        rare.setNext(p);
        rare = p;
        size++;
    }

    public Object deQueue() throws QueueEmptyException {
        if(getSize()<1){
            throw new QueueEmptyException("错误：队列空");
        }
        SLNode p = front.getNext();
        front.setNext(p.getNext());
        size -- ;
        if(getSize()<1) rare = front;
        return p.getData();
    }

    public Object peek() throws QueueEmptyException {
        if(getSize()<1){
            throw new QueueEmptyException("错误：队列空");
        }
        SLNode p = front.getNext();
        return p.getData();
    }
    public void print(){
        SLNode newNode = front;
        System.out.print("【所有元素】");
        for(int i=0;i<getSize();i++){
            System.out.print(newNode.getNext().getData()+" ");
            newNode = newNode.getNext();
        }
        System.out.println();
    }
}
