
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

//        Person person = new Person();   // 在使用类创建对象的时候，，构造器就会被调用
//        System.out.print(person.name);
        StaticPerson staticPerson = new StaticPerson();
        StaticPerson staticPerson1 = new StaticPerson();
        StaticPerson.info = "Test";

        System.out.println(StaticPerson.info);
        StaticPerson.test(); 
    }
}