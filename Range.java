package Range;


import java.util.Iterator;



public class Range implements Iterable<Integer>, Iterator<Integer>, Comparable<Integer>{
    int min=0;
    int max=0;
    int num=0;
    private Iterator itr=null;
    private int current=0;
    private int step =1;
    public Range(int min, int max){
        if(min>max){this.step=-1;}
        this.min=min;
        this.max=max;
        current=min;
    }
    public Range(int min, int num, int step){
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
    public Integer next() {
        int ret=current;
        current+=step;
        return ret;
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
    
    public int random(){
        return (int)(Math.random()*(max-min+1)/step)+min;
    }
    
    public static int random(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    
    public static int random(int min, int max, int step){
        return (int)(Math.random()*(max-min+1)/step)+min;
    }

}
