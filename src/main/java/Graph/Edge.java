package Graph;

/**
 * Created by pan.sun on 2017/5/8.
 */
public class Edge {
    public static final int NORMAL = 0;
    public static final int MST = 1;
    public static final int CRITICAL = 2;//关键路径中的边
    private int weight;//权值
    private Object info;//边的信息
}
