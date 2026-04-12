import java.util.*;
public class stack1{
    public static boolean isDupliacateParanthesis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        if(!s.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
          System.out.print(isDupliacateParanthesis("(a-b)"));
    }
}
