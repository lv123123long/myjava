public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        Person person = new Person();
        person.name = "xiaoming";
        System.out.println(person.name);

        System.out.print(person.test(100));

    }
}