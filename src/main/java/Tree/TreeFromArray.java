package Tree;

/**
 * Created by pan.sun on 2017/4/14.
 */
public class TreeFromArray {
    //数组方式创建树，小左大右
    private int MaxSize = 16;
    private int[] TreeArray = new int[MaxSize];
    public TreeFromArray(){
        for(int i=0;i<MaxSize;i++){
            TreeArray[i] = 0;
        }
    }
    public int getSize(){
        return MaxSize;
    }
    public void create(int data){
        int treeLevel = 1;
        while(TreeArray[treeLevel] != 0){
            if(data<TreeArray[treeLevel]){
                treeLevel = treeLevel*2;//左子树
            }else{
                treeLevel = treeLevel*2+1;//右子树
            }
        }
        System.out.println("【当前level】"+treeLevel+"----"+data);
        TreeArray[treeLevel] = data;
    }
    public void print(){
        System.out.print("【所有元素】");
        for(int i=0;i<MaxSize;i++){
            System.out.print(TreeArray[i]+" ");
        }
    }
}
