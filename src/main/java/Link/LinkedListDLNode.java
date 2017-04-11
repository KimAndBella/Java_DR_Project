package Link;

import Exception.*;

import java.awt.dnd.DnDConstants;

/**
 * Created by pan.sun on 2017/4/11.
 */
public class LinkedListDLNode implements LinkedList {
    private int size;
    private DLNode head;
    private DLNode tail;
    public LinkedListDLNode(){
        size = 0;
        head = new DLNode();
        tail = new DLNode();
        //关键的头尾
        head.setNext(tail);
        tail.setPre(head);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public Node getFirst() throws OutOfBoundaryException {
        if(isEmpty()){
            throw new OutOfBoundaryException("链表为空");
        }
        return head.getNext();
    }

    public Node getLast() throws OutOfBoundaryException {
        if(isEmpty()){
            throw new OutOfBoundaryException("链表为空");
        }
        return tail.getPre();
    }
    public DLNode checkPosition(Node p) throws InvalidNodeException{
        if(p == null){
            throw new InvalidNodeException("错误：p为空");
        }
        if(p == head){
            throw new InvalidNodeException("错误：p指向头结点");
        }
        if(p == tail){
            throw new InvalidNodeException("错误：p指向尾结点");
        }
        return (DLNode)p;
    }
    public Node getNext(Node p) throws InvalidNodeException, OutOfBoundaryException {
        DLNode node = checkPosition(p);
        node = node.getNext();
        if(node == tail){
            throw new OutOfBoundaryException("错误：已经是链表尾节点");
        }
        return node;
    }

    public Node getPre(Node p) throws InvalidNodeException, OutOfBoundaryException {
        DLNode node = checkPosition(p);
        if(node == head){
            throw new OutOfBoundaryException("错误：已经是链表头节点");
        }
        return node;
    }

    public Node insertFirst(Object data) {
        DLNode node = new DLNode(data,head,head.getNext());
        head.getNext().setPre(node);
        head.setNext(node);
        size++;
        return node;
    }

    public Node insertLast(Object data) {
        DLNode node = new DLNode(data,tail.getPre(),tail);
        tail.getPre().setNext(node);
        tail.setPre(node);
        size++;
        return node;
    }

    public Node insertAfter(Node p, Object data) throws InvalidNodeException {
        DLNode node = checkPosition(p);
        DLNode newNode = new DLNode(data,node,node.getNext());
        node.setNext(newNode);
        node.getNext().setPre(newNode);
        size++;
        return newNode;
    }

    public Node insertBefore(Node p, Object data) throws InvalidNodeException {
        DLNode node = checkPosition(p);
        DLNode newNode = new DLNode(data,node.getPre(),node);
        node.setPre(newNode);
        node.getPre().setNext(newNode);
        size++;
        return newNode;
    }

    public Object remove(Node p) throws InvalidNodeException {
        DLNode node = checkPosition(p);
        node.getPre().setNext(node.getNext());
        node.getNext().setPre(node.getPre());
        size--;
        return node.getData();
    }

    public Object removeFirst() throws OutOfBoundaryException {
        if(isEmpty()){
            throw new OutOfBoundaryException("错误：链表已经指向头结点");
        }
        return head.getNext().getData();
    }

    public Object removeLast() throws OutOfBoundaryException {
        if(isEmpty()){
            throw new OutOfBoundaryException("错误：链表已经指向尾结点");
        }
        return tail.getPre().getData();
    }

    public Object replace(Node p, Object e) throws InvalidNodeException {
        DLNode node = checkPosition(p);
        Object obj = node.getData();
        node.setData(e);
        return obj;
    }

    public Iterator elements() {
        return new LinkedListIterator(this);
    }
}
