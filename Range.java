package Range;


import java.util.Iterator;



public class Range implements Iterable<Integer>, Iterator<Integer>, Comparable<Integer>{
    int min=0;
    int max=0;
    private Iterator itr=null;
    private int current=0;
    public Range(int min, int max){
        this.min=min;
        this.max=max;
        current=min;
    }

    @Override
    public boolean hasNext() {
        boolean b=current<=max;
        if(!b)current=min;
        return b;
    }

    @Override
    public Integer next() {
        return current++;
    }

    @Override
    public int compareTo(Integer o) {
        int r=0;
        r=(o<min)?-1:r;
        r=(o>max)?1:r;
        return r;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }
    
    public boolean equals(Integer i) {
        return this.compareTo(i)==0;
    }
}
