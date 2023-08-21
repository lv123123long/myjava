/**
 * @author: Lvlongxin
 * @description  计算水仙花数，，，就是每个数字的拆分后的三次方相加等于数字本身
 * @date: 2023/8/21 22:44
 */

public class OneAndOne {
    public static void main(String[] args){
        for (int i = 100; i < 1000; i++){
            int a = i %10;
            int b = i / 10 % 10;
            int c = i /100;
            if (a * a * a + b * b * b + c * c * c == i){
                System.out.println(i);
            }
        }
    }
}
