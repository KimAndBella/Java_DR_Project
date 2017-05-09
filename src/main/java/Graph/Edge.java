package Graph;

import Link.Node;
import sun.security.x509.EDIPartyName;

/**
 * Created by pan.sun on 2017/5/8.
 */
public class Edge {
    public static final int NORMAL = 0;
    public static final int MST = 1;
    public static final int CRITICAL = 2;//关键路径中的边
    private int weight;//权值
    private Object info;//边的信息
    private Node edgePosition;//边在边表中的位置
    private Node firstVexPosition;//边的第一顶点的位置
    private Node secondVexPosition;//边的第二顶点的位置
    private Node edgeFirstPosition;//边在第一顶点的邻接边的位置
    private Node edgeSecondPosition;//边在第二顶点的邻接边的位置
    private int type;//边的类型
    private int graphType;//所在图的类型
    //构造方法：在图G中引入一条新边，其顶点为u , v
    public Edge(Graph g , Vertex u,Vertex v,Object info){
        this(g,u,v,info,1);
    }
    public Edge(Graph g,Vertex u,Vertex v,Object info ,int weight){
        this.info = info;
        this.weight = weight;
        this.edgePosition = g.insert(this);
        this.firstVexPosition = u.getVexPosition();
        this.secondVexPosition = v.getVexPosition();
        type = Edge.NORMAL;
        graphType = g.getGraphType();
        if(graphType == Graph.UndirectedGraph){
            //如果是无向图，边应当加入其两个顶点的邻接边表
            edgeFirstPosition = u.getAdjacentEdges().insertLast(this);
            edgeSecondPosition = v.getAdjacentEdges().insertLast(this);
        }else{
            //如果是有向图，边加入起始点的邻接边表，终止点的逆邻接边表
            edgeFirstPosition = u.getAdjacentEdges().insertLast(this);
            edgeSecondPosition = v.getReAdjacentEdges().insertLast(this);
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Node getEdgePosition() {
        return edgePosition;
    }

    public void setEdgePosition(Node edgePosition) {
        this.edgePosition = edgePosition;
    }

    public Node getFirstVexPosition() {
        return firstVexPosition;
    }

    public void setFirstVexPosition(Node firstVexPosition) {
        this.firstVexPosition = firstVexPosition;
    }

    public Node getSecondVexPosition() {
        return secondVexPosition;
    }

    public void setSecondVexPosition(Node secondVexPosition) {
        this.secondVexPosition = secondVexPosition;
    }

    public Node getEdgeFirstPosition() {
        return edgeFirstPosition;
    }

    public void setEdgeFirstPosition(Node edgeFirstPosition) {
        this.edgeFirstPosition = edgeFirstPosition;
    }

    public Node getEdgeSecondPosition() {
        return edgeSecondPosition;
    }

    public void setEdgeSecondPosition(Node edgeSecondPosition) {
        this.edgeSecondPosition = edgeSecondPosition;
    }


    //与边的类型相关的方法
    public void setToMST(){
        this.type = Edge.MST;
    }
    public void setToCritical(){
        this.type = Edge.CRITICAL;
    }
    public void resetType(){
        this.type = Edge.NORMAL;
    }
    public boolean isMSTEdge(){
        return this.type == Edge.MST;
    }
    public boolean isCritical(){
        return this.type == Edge.CRITICAL;
    }
}
