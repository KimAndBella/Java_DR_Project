package Graph;

import Link.LinkedList;
import Link.LinkedListDLNode;
import Link.Node;

/**
 * Created by pan.sun on 2017/4/25.
 */
public class Vertex {
//    public char value ;
//    public Vertex(char data){
//        this.value = data;
//    }
    private Object info;//顶点信息
    private LinkedList adjacentEdges;//顶点的邻接边表
    private LinkedList reAdjacentEdges;//顶点的逆邻接边，无向图为空
    private boolean visited;//访问状态
    private Node vexPosition;//顶点位置
    private int graphType;//顶点所在图的类型
    private Object application;//应用信息

    //构造方法：在图中新引入一个顶点
    public Vertex(Graph g, Object info){
        this.info = info;
        this.adjacentEdges = new LinkedListDLNode();
        this.reAdjacentEdges = new LinkedListDLNode();
        this.visited = false;
        this.graphType = g.getGraphType();
        this.vexPosition = g.insert(this);
        this.application = null;
    }
    //辅助方法：判断顶点所在图的类型
    public boolean isUnDiGraphNode(){
        return graphType == Graph.UndirectedGraph;
    }
    //获取或设置顶点信息
    public Object getInfo() {
        return info;
    }
    public void setInfo(Object info) {
        this.info = info;
    }

    //与顶点的度相关的方法
    public int getDeg(){
        if(isUnDiGraphNode()){
            return adjacentEdges.getSize();//无向图顶点的度为邻接边表的规模
        }else{
            return getOutDeg()+getInDeg();//有向图的度为出度+入度
        }
    }
    //出度
    public int getOutDeg(){
        return adjacentEdges.getSize();//出度为邻接边表的size
    }
    //入度
    public int getInDeg(){
        if(isUnDiGraphNode()){
            return adjacentEdges.getSize();//无向图 入度 为邻接表的size
        }else{
            return reAdjacentEdges.getSize();//有向图的入度为逆邻接边表的size
        }
    }

    //获取与顶点关联的边
    public LinkedList getAdjacentEdges(){
        return adjacentEdges;
    }
    public LinkedList getReAdjacentEdges(){
        if(isUnDiGraphNode()){
            return adjacentEdges;//无向图顶点没有逆邻接边表
        }else{
            return reAdjacentEdges;
        }
    }
    //取顶点所属图顶点集中的位置
    public Node getVexPosition(){
        return vexPosition;
    }
    //与顶点访问状态相关的方法
    public boolean isVisited(){
        return isVisited();
    }
    public void setToVisited(){
        this.visited = true;
    }
    public void setUnVisited(){
        this.visited = false;
    }

    //取或设置顶点应用信息
    protected Object getAppObj(){
        return application;
    }
    protected void setAppObj(Object obj){
        this.application = obj;
    }
    //重置顶点状态信息
    public void resetStatus(){
        this.visited = false;
        this.application = null;
    }

}
