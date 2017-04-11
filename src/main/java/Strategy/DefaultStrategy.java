package Strategy;

/**
 * Created by pan.sun on 2017/4/11.
 */
public final class DefaultStrategy implements  Strategy {
    public boolean equal(Object data1, Object data2) {
        return data1.toString().equals(data2.toString());
    }

    public int compare(Object data1, Object data2) {
        int comp = data1.toString().compareTo(data2.toString());
        if(comp == 0){
            return 0;
        }else if(comp > 0){
            return 1;
        }else{
            return -1;
        }
    }
}
