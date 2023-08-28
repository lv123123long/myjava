import com.test.entity.Test;
import com.test.entity.Study;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//        Test test = new Test();
//        Test.Inner inner = test.new Inner();
//        Study study = (int a, int b) -> Integer.sum(a, b);
//        System.out.println(study.sum(10, 20));
//
//        Study jiandage = Integer::sum;
//        System.out.println(jiandage.sum(20, 40));

        System.out.println(test(1, 0));
    }

    private static int test(int a, int b){
        return a/b;
    }
}