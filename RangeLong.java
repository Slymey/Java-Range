package Range;


import java.util.Iterator;



public class RangeLong implements Iterable<Long>, Iterator<Long>, Comparable<Long>{
    long min=0;
    long max=0;
    long num=0;
    private Iterator itr=null;
    private long current=0;
    private long step =1;
    public RangeLong(long min, long max){
        if(min>max){this.step=-1;}
        this.min=min;
        this.max=max;
        current=min;
    }
    public RangeLong(long min, long num, long step){
        this.min=min;
        this.num=num;
        this.step=step;
        current=min;
        this.max=min+num*step;
        if(num<1){
            this.min=0;
            this.max=0;
            this.step=0;
        }
    }

    @Override
    public boolean hasNext() {
        boolean b=false;
        if(step<0){
            b=current>=max;
        }else{
            b=current<=max;
        }
        if(!b)current=min;
        return b;
    }

    @Override
    public Long next() {
        long ret=current;
        current+=step;
        return ret;
    }

    @Override
    public int compareTo(Long o) {
        int r=0;
        r=(o<min)?-1:r;
        r=(o>max)?1:r;
        return r;
    }

    @Override
    public Iterator<Long> iterator() {
        return this;
    }
    
    public boolean equals(Long i) {
        return this.compareTo(i)==0;
    }
    
    public long random(){
        return (long)(Math.random()*(max-min+1)/step)*step+min;
    }
    
    public static long random(long min, long max){
        return (long)(Math.random()*(max-min+1)+min);
    }
    
    public static long random(long min, long max, long step){
        return (long)(Math.random()*(max-min+1)/step)*step+min;
    }

}
