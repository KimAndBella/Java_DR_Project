package Stack;
import Exception.*;
/**
 * Created by pan.sun on 2017/4/12.
 */
public class StackArray implements Stack {
    private int LEN = 5;
    private int top;
    private Object[] elements;
    public StackArray(){
        this.top = -1;
        this.elements = new Object[LEN];
    }
    public int getSize() {
        return top+1;
    }

    public void push(Object data) {
        if(getSize()>=elements.length){
            Object[] newEle = new Object[elements.length*2];
            for(int i=0;i<elements.length;i++){
                newEle[i] = elements[i];
            }
            elements = newEle;
        }
        elements[++top] = data;
    }

    public Object pop() throws StackEmptyException {
        if(getSize()<1){
            throw new StackEmptyException("错误：空栈");
        }
        Object obj = elements[top];
        elements[top--] = null;
        return obj;
    }

    public boolean isEmpty() {
        return top<0;
    }

    public Object peek() throws StackEmptyException {
        if(getSize()<1){
            throw new StackEmptyException("错误：空栈");
        }
        return elements[top];
    }
    public void print() {
        if(getSize()<1){
            throw new StackEmptyException("错误：空栈");
        }
        System.out.print("【所有元素】");
        for(int i=0;i<getSize();i++){
            System.out.print(elements[i]+"  ");
        }
        System.out.println();
    }
}
