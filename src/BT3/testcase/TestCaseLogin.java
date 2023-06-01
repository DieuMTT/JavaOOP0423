package BT3.testcase;

import BT3.common.BaseTest;

import java.sql.SQLOutput;

public class TestCaseLogin extends BaseTest {
    public TestCaseLogin(String browser, boolean report, boolean headless) {
        super(browser, report, headless);
    }

    public static void Login() {
        System.out.println("Steps to login:");
        System.out.println("Step 1: Open url" + " " + getBrowser());
        System.out.println("Step 2: Enter the valid email address");
        System.out.println("Step 3: Enter the valid password");
        System.out.println("Step 4: Click on Login button");
    }

    public static void main(String[] args) {
        TestCaseLogin tc1 = new TestCaseLogin("https://cms.anhtester.com/login", true, true);
        createDriver();
        tc1.Login();
        closeDriver();
    }
}
