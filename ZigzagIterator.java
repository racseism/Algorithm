import java.util.List;

public class ZigzagIterator {
    List<Integer> v1;
    List<Integer> v2;
    int v1CurrentIndex = 0;
    int v2CurrentIndex = 0;
    boolean secondTurn = false;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.v1 = v1;
        this.v2 = v2;
        if (v1.size() == 0){
            secondTurn = true;
        }
    }

    public int next() {
        if (secondTurn){
            v2CurrentIndex++;
            if (v1CurrentIndex < v1.size()){
                secondTurn = false;
            }
            
            return v2.get(v2CurrentIndex - 1);
        }else{
            v1CurrentIndex++;
            if (v2CurrentIndex < v2.size()){
                secondTurn = true;
            }
            
            return v1.get(v1CurrentIndex - 1);
        }
    }

    public boolean hasNext() {
        if (v1CurrentIndex < v1.size() || v2CurrentIndex < v2.size()){
            return true;
        }
        
        return false;
    }
}
