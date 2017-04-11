package Character2_Practice.Case1;

/**
 * Created by pan.sun on 2017/4/11.
 */
public class Link {
    private Link next;
    private Object data1;
    private Object data2;
    public Link(Object it,Object it1,Link nextval){
        data1 = it;
        data2 = it1;
        next = nextval;
    }
    public Link(Link nextval){
        this.next = nextval;
    }
    public Link getNext(){
        return next;
    }
    public void setNext(Link nextval){
        this.next = nextval;
    }

    public Object getData1() {
        return data1;
    }

    public void setData1(Object data1) {
        this.data1 = data1;
    }

    public Object getData2() {
        return data2;
    }

    public void setData2(Object data2) {
        this.data2 = data2;
    }
}
