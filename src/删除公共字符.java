/*
【删除公共字符】输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变 成”Thy r stdnts.”
输入：They are students. aeiou
输出：Thy r stdnts.

 */

import java.util.Scanner;
public class 删除公共字符 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String A=in.nextLine();
        String B=in.nextLine();
        char[] a=A.toCharArray();
        char[] b=B.toCharArray();
        for(int i=0;i<b.length;i++){
            String C=String.valueOf(b[i]);
            A= A.replace(C,"");
        }
        System.out.println(A);
    }
}
