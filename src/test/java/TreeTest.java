import Tree.TreeFromArray;
import org.junit.Test;

import java.util.Random;

/**
 * Created by pan.sun on 2017/4/14.
 */
public class TreeTest {
    @Test
    public void test1(){
        TreeFromArray treeFromArray = new TreeFromArray();
        int[] result = new int[treeFromArray.getSize()];
        System.out.print("【输入参数】");
        for(int i=0;i<treeFromArray.getSize();i++){
//            int a = new Random().nextInt(20);
            int a = i;
            treeFromArray.create(a);
        }
        System.out.println();
        treeFromArray.print();
    }
}
