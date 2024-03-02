package structures.ex1;

public class ChildTest extends ParentTest {
    protected String test1() {
        return "child test 1";
    }

    public static void main(String[] args) {
        ChildTest childTest = new ChildTest();
        System.out.println(childTest.test1());
    }
}
