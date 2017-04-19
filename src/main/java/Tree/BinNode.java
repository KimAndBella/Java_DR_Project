package Tree;

/**
 * Created by pan.sun on 2017/4/18.
 */
public class BinNode {
    private int data;
    private BinNode left;
    private BinNode right;
    private boolean leftIsThread;
    private boolean rightIsThread;
    public BinNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
        this.leftIsThread = false;
        this.rightIsThread = false;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinNode getLeft() {
        return left;
    }

    public void setLeft(BinNode left) {
        this.left = left;
    }

    public BinNode getRight() {
        return right;
    }

    public void setRight(BinNode right) {
        this.right = right;
    }

    public boolean isLeftIsThread() {
        return leftIsThread;
    }

    public void setLeftIsThread(boolean leftIsThread) {
        this.leftIsThread = leftIsThread;
    }

    public boolean isRightIsThread() {
        return rightIsThread;
    }

    public void setRightIsThread(boolean rightIsThread) {
        this.rightIsThread = rightIsThread;
    }
}
