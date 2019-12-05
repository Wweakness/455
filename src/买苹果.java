/*
【买苹果】小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
可是小易现在只想购买恰好n个苹果，小易想 购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。
输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
输入：20
输出：3
 */


import java.util.Scanner;
public class 买苹果 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 6) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < 17; i++) {
                if (6 * i < n) {
                    if ((n - 6 * i) % 8 == 0) {

                        int j = (n - 6 * i) / 8;
                        int sum = i + j;
                        System.out.println(sum);
                        break;
                    } else {
                        continue;
                    }
                } else if (6 * i == n) {
                    System.out.println(i);
                    break;
                } else {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}