import java.util.*;
public class stack1{
    public static String revereseString(Stack<Character> s,String str){
            for(int i=0;i<str.length();i++){
                s.push(str.charAt(i));
            }
            StringBuilder result=new StringBuilder("");
            while(!s.isEmpty()){
                char curr=s.pop();
                result.append(curr);
            }
            return result.toString();
   }
  public static void main(String[] args){
    Stack<Integer> s=new Stack<>();
    String str="gayatri";
    System.out.println( revereseString(s,str));
  }

}
