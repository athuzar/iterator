import java.util.NoSuchElementException;
import java.lang.Iterable;
import java.util.Iterator;


public class Range implements Iterable<Integer> {
    private int start;
    private int end;

    public Range(int s, int e) {
        start = s;
        end = e;
    }

    public int getStart() {
    	return start;
    }

    public int getEnd() {
    	return end;
    }

    //have them code this
    //write the iterator() method from Iterable



}
