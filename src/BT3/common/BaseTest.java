package BT3.common;

public class BaseTest extends Constants {

    public BaseTest(String browser, boolean report, boolean headless) {
        super(browser, report, headless);
    }

    public static void createDriver() {
        System.out.println("Create Browser");
        System.out.println("Browser:" + Constants.getBrowser());
        System.out.println("Report:" + Constants.isReport());
        System.out.println("Headless:" + Constants.isHeadless());
    }

    public static void closeDriver() {
        System.out.println("Close Browser:" + Constants.getBrowser());
    }
}
