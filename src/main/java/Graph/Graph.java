package Graph;

import Link.Iterator;
import Link.Node;
import Exception.*;

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
    public Node insert(Vertex v);//添加一个顶点
    public Node insert(Edge e);//添加一条边
    public boolean areAdjancent(Vertex u,Vertex v);//判断顶点u和v是否邻接
    public Edge edgeFromTo(Vertex u,Vertex v);//返回一条从顶点u到v的边
    public Iterator adjVertexs(Vertex u);//返回可以从顶点u直接到达的顶点
    public Iterator DFSTraverse(Vertex v);//对图进行深度优先遍历
    public Iterator BFSTraverse(Vertex v);//对图进行广度优先遍历
    public Iterator shortestPath(Vertex v);//求顶点v到其他顶点的最短路径
    public void generateMST() throws UnsupportedOperation;//求无向图的最小生成树，如果是有向图不支持该操作
    public Iterator toplogicalSort() throws UnsupportedOperation;//求有向图的拓扑序列，无向图不支持此操作
    public void criticalPath() throws UnsupportedOperation;//求有向无环图的关键路径，无向图不支持此操作
}
