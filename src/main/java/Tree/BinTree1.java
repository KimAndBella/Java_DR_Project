package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pan.sun on 2017/4/17.
 */
public class BinTree1 {
    private int[] array = {1,2,3,4,5,6,7,8,9};
    private static List<Node> nodeList = null;
    private static class Node{
        private Node leftChild;
        private Node rightChild;
        int data;
        public Node(int newData){
            leftChild = null;
            rightChild = null;
            this.data = newData;
        }
    }
    public void createBinTree(){
        nodeList = new ArrayList<Node>();
        for(int nodeIndex = 0;nodeIndex<array.length;nodeIndex++){
            nodeList.add(new Node(array[nodeIndex]));
        }
        for(int parentIndex = 0; parentIndex<array.length/2-1;parentIndex++){
            nodeList.get(parentIndex).leftChild = nodeList.get(parentIndex*2+1);
            nodeList.get(parentIndex).rightChild = nodeList.get(parentIndex*2+2);
        }
        //判断最后一个结点
        int lastParentIndex = array.length/2-1;
        nodeList.get(lastParentIndex).leftChild = nodeList.get(lastParentIndex*2+1);
        if(array.length%2 == 1){
            nodeList.get(lastParentIndex).rightChild = nodeList.get(lastParentIndex*2+2);
        }
    }
    //先序遍历
    public static void preOrderTraverse(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preOrderTraverse(node.leftChild);
        preOrderTraverse(node.rightChild);
    }
    //中序遍历
    public static void inOrderTraverse(Node node){
        if(node == null){
            return;
        }
        inOrderTraverse(node.leftChild);
        System.out.print(node.data+" ");
        inOrderTraverse(node.rightChild);
    }
    //后序遍历
    public static void postOrderTraverse(Node node){
        if(node == null){
            return;
        }
        postOrderTraverse(node.leftChild);
        postOrderTraverse(node.rightChild);
        System.out.print(node.data+" ");
    }

    public static void main(String[] args){
        BinTree1 binTree1 = new BinTree1();
        binTree1.createBinTree();
        Node root = nodeList.get(0);
        System.out.println("先序遍历");
        binTree1.preOrderTraverse(root);
        System.out.println();
        System.out.println("中序遍历");
        binTree1.inOrderTraverse(root);
        System.out.println();
        System.out.println("后序遍历");
        binTree1.postOrderTraverse(root);
        System.out.println();
    }
}
