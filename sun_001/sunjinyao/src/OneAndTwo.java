/**
 * @author: Lvlongxin
 * @description 打印九九乘法表
 * @date: 2023/8/21 22:49
 */

public class OneAndTwo {
    public static void main(String[] args){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                if(j > i){
                    break;
                }
                System.out.print(j + " x " + i + "=" + i*j + "   ");
            }
            System.out.print("\n");
        }
    }
}
