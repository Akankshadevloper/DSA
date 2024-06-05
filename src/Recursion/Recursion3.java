package Recursion;

public class Recursion3 {
    public static boolean [] map = new boolean[25 ];
    public static void RemoveDup(String str, int idx,String newString){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar -'a']){
          RemoveDup(str, idx+1,newString);
        }else {
            newString+= currChar;
            map[currChar-'a']=true;
            RemoveDup(str,idx+1,newString);
        }

    }
    public static void main(String[] args){
        String str = " abbccda";
        RemoveDup(str,0," ");

    }
}

//error
