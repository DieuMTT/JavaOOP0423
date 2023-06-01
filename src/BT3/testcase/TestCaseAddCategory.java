package BT3.testcase;


public class TestCaseAddCategory extends TestCaseLogin {
    public TestCaseAddCategory(String browser, boolean report, boolean headless) {
        super(browser, report, headless);
    }

    public static void AddCategory() {
        TestCaseLogin.Login();
        System.out.println("Step to add a category");
    }

    public static void main(String[] args) {
        TestCaseAddCategory tc2 = new TestCaseAddCategory("https://cms.anhtester.com/login", true, true);
        createDriver();

        AddCategory();

        closeDriver();

    }
}
