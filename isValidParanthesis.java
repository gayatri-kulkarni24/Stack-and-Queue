public class stack1{
      public static boolean isValidParanthesis(String str){
              Stack<Character> s=new Stack<>();
              for(int i=0;i<str.length();i++){
                  char ch=str.charAt(i);
      
                  if(ch=='(' || ch=='{' || ch=='['){
                      s.push(ch);
                  }else{
                      if(s.isEmpty()){
                          return false;
                      }
                      if(s.peek()=='(' && ch==')' || s.peek()=='{' && ch=='}' || s.peek()=='[' && ch==']'){
                          s.pop();
                          return true;
                      }else{
                          return false;
                      }
                  }
              }
              return false;
          }
            public static void main(String[] args){
          System.out.print(isValidParanthesis("({[]})"));
      }
}
