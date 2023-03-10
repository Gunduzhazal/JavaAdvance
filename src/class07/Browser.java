package class07;

public class Browser {

    void openBrowser() {
        System.out.println("Opening a browser");
    }

    void navigate() {
        System.out.println("opening the url");
    }

    void test() {
        System.out.println("Testing the webpage");
    }

    void closeBrowser() {
        System.out.println("closing the browser");
    }
}

class Chrome extends Browser {
    @Override
    public void openBrowser() {
        System.out.println("opening the browser in less than 1 sec");
    }
}

class FireFox extends Browser {
    void openBrowser() {
        System.out.println("opening the browser in less than 2 sec");
    }
}
