import Link.Iterator;
import Link.LinkedListDLNode;
import Link.ListSLinked;
import org.junit.Test;

/**
 * Created by pan.sun on 2017/4/11.
 */
public class LinkTest {
    @Test
    public void test1(){
        ListSLinked listSLinked = new ListSLinked();
        //测试插入
        for(int i=0 ; i<10 ; i++){
            listSLinked.insert(i,"kim-"+i);
        }
        //测试获取长度
        System.out.println("【单链表长度】"+listSLinked.getSize());
        //测试获取数据
        System.out.print("【全部元素】");
        for(int i=0;i<listSLinked.getSize();i++){
            System.out.print(listSLinked.get(i)+",");
        }
        System.out.println();
        //测试是否为空
        System.out.println("【单链表是否为空】"+listSLinked.isEmpty());
        //测试是否包含某一个数据
        System.out.println("【是否包含kim-8】"+listSLinked.contains("kim-8"));
        System.out.println("【是否包含kim-100】"+listSLinked.contains("kim-100"));
        //测试前插后插
        listSLinked.insertAfter("kim-5","kim-555");
        listSLinked.insertBefore("kim-5","kim-444");
        System.out.print("【插入两个元素后】");
        for(int i=0;i<listSLinked.getSize();i++){
            System.out.print(listSLinked.get(i)+",");
        }
        //测试删除元素
        System.out.println();
        System.out.println("【删除kim-2是否成功】"+listSLinked.remove("kim-2"));
        System.out.println("【删除第3个元素是否成功】"+listSLinked.remove(2));
        //测试替换某个位置的数据
        System.out.println("【替换第二个位置为bella-1】"+listSLinked.replace(1,"bella-1"));
        //测试某个元素的位置
        System.out.println("【kim-444的位置】"+listSLinked.indexOf("kim-444"));
        for(int i=0;i<listSLinked.getSize();i++){
            System.out.print(listSLinked.get(i)+",");
        }

    }


    @Test
    public void test2(){
        LinkedListDLNode linkedListDLNode = new LinkedListDLNode();
        for(int i=0;i<10;i++){
            linkedListDLNode.insertFirst("kim-"+i);
        }
        System.out.print("【所有元素】");
        Iterator iterator = linkedListDLNode.elements();
        while(iterator.currentItem()!=null){
            System.out.println(iterator.currentItem()+",");
        }
    }
}
