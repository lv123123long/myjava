/**
 * @author: Lvlongxin
 * @description 构造器的使用
 * @date: 2023/8/23 0:03
 */

public class Person {
    String name = "属性";
    int age;
    String sex;

    {
        System.out.println("我是代码块1");
        System.out.println(name);
        name = "代码块1";
    }

    public Person(){
        name = "xiaoming";
        age = 100;
        sex = "男";
        System.out.print("我构造成功了");
    }


    {
        System.out.println("我是代码块2");
        System.out.println(name);
        name = "代码块2";
    }
}
/*
    Hello and welcome!
        我是代码块1
        属性
        我是代码块2
        代码块1
        我构造成功了xiaoming
*/