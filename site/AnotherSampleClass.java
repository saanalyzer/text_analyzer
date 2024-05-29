package site;

public class AnotherSampleClass {
    String str;

    public AnotherSampleClass(String str){
        this.str = str;
    }

    public int getLength(){
        return str.length();
    }

    public char getCharacter(int ind){
        if(ind >= this.getLength()){
            return ' ';
        }
        char[] strArray = str.toCharArray();
        return strArray[ind];
    }
//comment 
    public char getFirstElement(){
        return getCharacter(0);
    }

    public char getLastElement(){
        return getCharacter(getLength()-1);
    }
}
