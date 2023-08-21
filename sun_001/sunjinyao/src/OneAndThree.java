/**
 * @author: Lvlongxin
 * @description 斐波那契数列, 黄金分割数列，，兔子数列，后面一个数字，是前面两个数字的和
 * @date: 2023/8/21 22:59
 */

public class OneAndThree {
    public static void main(String[] args){
        int target = 7, result;
        int a = 1, b = 1, tmp;
        for (int i = 1; i < target; i++){
            tmp = a + b;
            a = b;
            b = tmp;

        }
        result = a;
        System.out.print(result);
    }
}
