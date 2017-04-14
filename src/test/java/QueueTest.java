import Queue.*;
import Stack.*;
import org.junit.Test;

/**
 * Created by pan.sun on 2017/4/13.
 */
public class QueueTest {
    //队列合并，交叉，最后剩余的追加
    @Test
    public void test1(){
        Queue queue1 = new QueueSLinked();
        for(int i=0;i<10;i++){
            queue1.enQueue("kim-"+i);
        }
//        queue.print();
//        System.out.println("【出队列】"+queue.deQueue());
//        queue.print();
        Queue queue2 = new QueueSLinked();
        for(int i=0;i<20;i++){
            queue2.enQueue("Bella-"+i);
        }
        Queue queueNew = new QueueSLinked();
        while(!queue1.isEmpty() && !queue2.isEmpty()){
            queueNew.enQueue(queue1.deQueue());
            queueNew.enQueue(queue2.deQueue());
        }
        while(!queue1.isEmpty()){
            queueNew.enQueue(queue1.deQueue());
        }
        while(!queue2.isEmpty()){
            queueNew.enQueue(queue2.deQueue());
        }
        queueNew.print();
    }
}
