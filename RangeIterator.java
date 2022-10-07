import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;
import java.util.Iterator;
import java.lang.Iterable;


public class RangeIterator implements Iterator<Integer>
{

    private Range range;
    private int index;

    public RangeIterator( Range r )
    {
        range = r;
        index = range.getStart();
    }

    //Please code the hasNext() method
    //Returns true if the iteration has more elements. (In other words, returns true if next() would return an element rather than throwing an exception.)




    //Please code the next() method
    //Returns the next element in the iteration. Throws NoSuchElementException if the iteration has no more elements.




    //ignore for now
    /*
    public void remove() {
        throw new UnsupportedOperationException();
    }
    */
}
