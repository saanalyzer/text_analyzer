package site;

public class SampleClass {
    int x;
    int y;

    public SampleClass(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getMin(){
        if (x < y){
            return x;
        }
        return y;
    }
}
