import java.util.*;
public class 合法括号序列判断 {
    /*
    对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。 给定一个字符串A和它的长度n，请
    返回一个bool值代表它是否为一个合法的括号串。
    一个合法的括号串定义为：1.只包括括号字符；2.左括号和右括号一一对应
    "(()())",6
     返回：true
     "()a()()",7
      返回：false
     */
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack stack=new Stack();
        char[] b=A.toCharArray();
        for(int i=0;i<n;i++){
            if(b[i]=='('){
                stack.push(b[i]);
            }
            if(b[i]==')'){
                if (!stack.isEmpty()){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            if(b[n-1]=='('){
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }else {
            return true;
        }
    }
}