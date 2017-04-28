package Graph;

/**
 * Created by pan.sun on 2017/4/25.
 */
/**
 * 图论算法   AOV 拓扑排序
 * */
public class AOV_TopoSort {
    static final int MAX = 100;
    static Vertex ver[];
    static int map[][];
    static int n;
    static char topoSort[];

    public static void main(String[] args){
        ver = new Vertex[MAX];
        map = new int[MAX][MAX];
        n = 0 ;
        topoSort = new char[MAX];
        //初始化邻接矩阵
        for(int i = 0 ; i < MAX ; i ++ ){
            for(int j = 0 ; j < MAX ; j ++){
                map[i][j] = 0 ;
            }
        }
        AOV_TopoSort ts = new AOV_TopoSort();
        //读入AOV网顶点的关键字
        ts.addVertex('A');
        ts.addVertex('B');
        ts.addVertex('C');
        ts.addVertex('D');
        ts.addVertex('E');
        ts.addVertex('F');
        ts.addVertex('G');
        ts.addVertex('H');
        ts.addVertex('I');
        ts.addVertex('J');
        ts.addVertex('K');
        ts.addVertex('L');

        //读入AOV网边的连接信息，由于是有向图，只需读入一次
        ts.addEdge(0, 1);
        ts.addEdge(0, 3);
        ts.addEdge(0, 10);
        ts.addEdge(1, 10);
        ts.addEdge(2, 3);
        ts.addEdge(2, 4);
        ts.addEdge(2, 5);
        ts.addEdge(3, 7);
        ts.addEdge(5, 7);
        ts.addEdge(5, 6);
        ts.addEdge(5, 8);
        ts.addEdge(6, 8);
        ts.addEdge(6, 9);
        ts.addEdge(10, 11);
        ts.addEdge(11, 9);
        ts.addEdge(11, 6);

        ts.topoSort();

    }

    //构造顶点关键字数组
    public void addVertex(char v){
        ver[n++] = new Vertex(v);
    }
    //构造边的邻接矩阵
    public void addEdge(int start,int end){
        map[start][end] = 1;
    }
    public void topoSort(){
        //num:顶点数量n要进行递减，因此起始存入num,作为输出序列遍历使用
        //isEdge:判定该边是否相连
        int num = n ;
        boolean isEdge;
        while( n > 0){
            int currrVer = 0;
            for(int row =  0; row < n ; row ++ ){
                isEdge = false;
                for(int col = 0 ; col < n ; col ++){
                    if(map[row][col] > 0){
                        isEdge = true;
                    }
                }
                if(!isEdge){
                    currrVer = row;
                }
            }
            topoSort[n-1] = ver[currrVer].value;
            if(currrVer != n-1 ){
                for(int i=currrVer;i<n;i++){
                    ver[i] = ver[i+1];
                }
            }
            for(int row = currrVer ; row < n-1 ; row++){
                for(int col = 0;col<n;col++){
                    map[row][col] = map[row+1][col];
                }
            }
            for(int col = currrVer ; col < n-1 ; col++){
                for(int row = 0;row<n;row++){
                    map[row][col] = map[row][col+1];
                }
            }
            n--;
        }
        System.out.print("【拓扑排序结果】");
        for(int i = 0;i<num;i++){
            System.out.print(topoSort[i]+"  ");
        }
    }
}
