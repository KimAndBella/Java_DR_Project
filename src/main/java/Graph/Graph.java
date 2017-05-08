package Graph;

import Link.Iterator;

/**
 * Created by pan.sun on 2017/5/8.
 */
public interface Graph {
    public static final int UndirectedGraph = 0;//无向图
    public static final int DirectedGraph = 1;//有向图


    public int getGraphType();//返回图类型
    public int getVexNum();//返回图的顶点数
    public int getEdgeNum();//返回图的边数
    public Iterator getVertex();//返回所有的顶点
    public Iterator getEdges();//返回所有的边
    public void remove(Vertex vertex);//删除一个顶点
    public void remove(Edge edge);//删除一条边

}
