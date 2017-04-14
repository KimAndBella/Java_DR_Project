package Stack;
import Link.SLNode;
import Stack.*;
import Exception.*;
/**
 * Created by pan.sun on 2017/4/13.
 */
public class StackSLink implements Stack {
    private SLNode top;
    private int size;
    public StackSLink(){
        top = new SLNode();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void push(Object data) {
        SLNode p = new SLNode(data,top);
        top = p;
        size++;
    }

    public Object pop() throws StackEmptyException {
        if(getSize()<1){
            throw new StackEmptyException("空栈");
        }
        Object data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    public boolean isEmpty() {
        return getSize()<=0;
    }

    public Object peek() throws StackEmptyException {
        return top.getData();
    }

    public void print() {
        SLNode slNode = top;
        System.out.print("【所有元素】");
        for(int i=0;i<getSize();i++){
            System.out.print(slNode.getData()+" ");
            slNode = slNode.getNext();
        }
        System.out.println();
    }
}
