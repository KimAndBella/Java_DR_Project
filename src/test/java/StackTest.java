import Stack.*;
import org.junit.Test;

/**
 * Created by pan.sun on 2017/4/12.
 */
public class StackTest {
    @Test
    public void test1(){
        Stack stack = new StackArray();
        for(int i=0;i<10;i++){
            stack.push("kim-"+i);
        }
        stack.print();
        System.out.println("【弹出一个元素后】"+stack.pop());
        stack.print();
        System.out.println("【弹出一个元素后，取栈顶元素】"+stack.peek());

    }
}
