package Tree2;

import Link.Node;

/**
 * Created by pan.sun on 2017/4/19.
 */
public class BinTreeNode implements Node{
    private Object data;
    private BinTreeNode parent;
    private BinTreeNode lChild;
    private BinTreeNode rChild;
    private int height;
    private int size;
    public BinTreeNode(){
        this(null);
    }
    public BinTreeNode(Object e ){
        this.data = e;
        this.parent = this.lChild = this.rChild = null;
        this.size = 1;
        this.height = 0;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }


    public boolean hasParent(){
        return this.parent!= null;
    }
    public boolean hasLChild(){
        return this.lChild != null;
    }
    public boolean hasRChild(){
        return this.rChild != null;
    }
    public boolean isLeaf(){
        return !hasLChild() && !hasRChild();
    }
    public boolean isLChild(){
        return hasParent() && this == parent.lChild;
    }
    public boolean isRChild(){
        return hasParent() && this == parent.rChild;
    }
    public int getHeight(){
        return height;
    }
    //更新当前节点和祖先的高度
    public void updateHeight(){
        size = 1;
        if(hasLChild()){
        }
    }

    public BinTreeNode getParent(){
        return parent;
    }
    //断开与父亲的关系
    public void sever(){
        if(!hasParent()){
            return;
        }
        if(isLChild()){
            parent.lChild = null;
        }else{
            parent.rChild = null;
        }
        parent.updateHeight();
//        parent.updateSize();
        parent = null;
    }
    public BinTreeNode getlChild(){
        return lChild;
    }
    public BinTreeNode setLChild(BinTreeNode lc){
        BinTreeNode oldLC = this.lChild;
        if(hasParent()){
//            lChild.server();
        }
        return null;

    }
























}
