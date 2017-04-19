package Tree;

/**
 * Created by pan.sun on 2017/4/18.
 */
public class ThreadTree {
    private BinNode root;
    private int size;
    private BinNode pre = null;
    public ThreadTree(){
        this.root = null;
        this.size = 0;
        this.pre = null;
    }
    public ThreadTree(int[] data){
        this.pre = null;
        this.size = data.length;
        this.root = createTree(data,1);
    }
    public BinNode createTree(int[] data,int index){
        if(index > data.length){
            return null;
        }
        BinNode node = new BinNode(data[index-1]);
        BinNode leftNode = createTree(data,2*index);
        BinNode rightNode = createTree(data,2*index+1);
        node.setLeft(leftNode);
        node.setRight(rightNode);
        return node;
    }
    public void inThread(BinNode root){
        if(root != null){
            inThread(root.getLeft());
            if(root.getLeft() == null){
                root.setLeftIsThread(true);
                root.set
            }
        }
    }
}
