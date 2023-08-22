/**
 * @author: Lvlongxin
 * @description 创建的一个类，人类
 * @date: 2023/8/21 23:12
 */

public class Person {
    String name;
    int age;
    String sex;


    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    int sun(int a, int b){
        int result;
        result = a + b;
        return result;
    }

    double sun(double a, double b){
        double result;
        result = a + b;
        return result;
    }


    int test(int n){
        if(n == 0) return 0;
        return test(n - 1) + n;
    }
}
