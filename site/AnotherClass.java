package site;

public class AnotherClass {
    String str;

    public AnotherClass(String str){
        this.str = str;
    }

    public int getLength(){
        return str.length();
    }

    public char getCharacter(int ind){
        if(ind >= this.getLength()){
            return '-';
        }
        char[] strArray = str.toCharArray();
        return strArray[ind];
    }
}
