package Link;

import Strategy.*;
import Exception.*;
/**
 * Created by pan.sun on 2017/4/11.
 */
public class ListSLinked implements List {
    private Strategy strategy;//元素比较
    private SLNode head;
    private int size;
    public ListSLinked(){
        this(new DefaultStrategy());
    }

    public ListSLinked(Strategy strategy) {
        this.strategy = strategy;
        head = new SLNode();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(Object ele) {
        SLNode p = head.getNext();
        int index = 0;
        while( p != null){
            if(strategy.equal(p.getData(),ele)) return index;
            else{
                p = p.getNext();
                index++;
            }
        }
        return -1;
    }
    public SLNode getNode(int i){
        SLNode p = head.getNext();
        for( ; i>0;i--){
            p = p.getNext();
        }
        return p;
    }
    public void insert(int i, Object ele) throws OutOfBoundaryException {
        if(i<0 || i>size){
            throw new OutOfBoundaryException("插入位置越界");
        }
        SLNode p = getPreNode(i);
        SLNode n = new SLNode(ele,p.getNext());
        p.setNext(n);
        size++;
        return;
    }
    public SLNode getPreNode(int i){
        SLNode p = head;
        for(;i>0;i--){
            p = p.getNext();
        }
        return p;
    }
    public SLNode getPreNode(Object data){
        SLNode p = head;
        while( p.getNext() != null){
            if(strategy.equal(p.getNext().getData(),data) ) return p;
            else p = p.getNext();
        }
        return null;
    }
    //=====================
    public boolean insertBefore(Object data, Object ele) {
        SLNode p = getPreNode(data);
        if( p != null){
            SLNode q = new SLNode(ele,p.getNext());
            p.setNext(q);
            size++;
            return true;
        }
        return false;
    }

    public boolean insertAfter(Object data, Object ele) {
        SLNode p = head.getNext();
        while( p != null){
            if(strategy.equal(p.getData(),data)){
                SLNode q = new SLNode(ele,p.getNext());
                p.setNext(q);
                size++;
                return true;
            }else{
                p = p.getNext();
            }
        }
        return false;
    }

    public Object remove(int i) throws OutOfBoundaryException {
        if(i < 0 || i > size){
            throw  new OutOfBoundaryException("删除node越界");
        }
        SLNode p = getPreNode(i);
        Object obj = p.getNext().getData();
        p.setNext(p.getNext().getNext());
        size -- ;
        return obj;
    }

    public boolean remove(Object ele) {
        SLNode p = getPreNode(ele);
        if( p != null){
            p.setNext(p.getNext().getNext());
            size--;
            return true;
        }
        return false;
    }
    //替换指定位置的元素的data，并返回原data
    public Object replace(int i, Object ele) throws OutOfBoundaryException {
        if(i<0 || i>size) throw new OutOfBoundaryException("替换时node越界");
        SLNode p = getNode(i);
        Object object = p.getData();
        p.setData(ele);
        return object;
    }

    public Object get(int i) throws OutOfBoundaryException {
        if(i<0 || i>size) throw new OutOfBoundaryException("获取时越界");
        return getNode(i).getData();
    }

    public boolean contains(Object data) {
        SLNode p = head.getNext();
        while(p != null){
            if(strategy.equal(p.getData(),data)) return true;
            else p = p.getNext();
        }
        return false;
    }
}
