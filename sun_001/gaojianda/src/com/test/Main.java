package com.test;

/**
 * @author: Lvlongxin
 * @description 入口类
 * @date: 2023/8/24 23:14
 */
import com.test.entity.Status;
import com.test.entity.Student;
public class Main {
    public static void main(String[] args){
        Student student = new Student();
        student.setStatus(Status.RUNNING);
        System.out.println(student.getStatus());
    }
}
