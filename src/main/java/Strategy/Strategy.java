package Strategy;

/**
 * Created by pan.sun on 2017/4/11.
 */
public interface Strategy {
    public boolean equal(Object data1,Object data2);
    /**
     *  data1 < data2 -1
     *  data1 = data2 0
     *  data1 > data2 1
     * */
    public int compare(Object data1,Object data2);
}
