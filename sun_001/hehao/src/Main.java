import com.test.entity.Test;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Test test = new Test();
        Test.Inner inner = test.new Inner();


    }
}