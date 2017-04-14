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
    //测试链式栈
    @Test
    public void test2(){
        Stack stack = new StackSLink();
        for(int i=0;i<10;i++){
            stack.push("kim-"+i);
        }
        stack.print();
        System.out.println("【元素个数】"+stack.getSize());
        System.out.println("【弹出一个元素后】"+stack.pop());
        stack.print();
        System.out.println("【弹出一个元素后，取栈顶元素】"+stack.peek());
    }
    @Test
    public void test3(){
        String b = "kim";
        String a = b;
        b = b+"kim";
        System.out.println(a);
    }

}
