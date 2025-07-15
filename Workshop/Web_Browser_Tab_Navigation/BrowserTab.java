package Workshop.Web_Browser_Tab_Navigation;

import java.util.Stack;

public class BrowserTab implements NavigationManager {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage = "Home";

    @Override
    public void openPage(String url) {
        backStack.push(currentPage);    
        currentPage = url;
        forwardStack.clear();          
        System.out.println("Opened: " + currentPage);
    }

    @Override
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Went back to: " + currentPage);
        } else {
            System.out.println("No pages to go back.");
        }
    }

    @Override
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Went forward to: " + currentPage);
        } else {
            System.out.println("No pages to go forward.");
        }
    }

    @Override
    public String getCurrentPage() {
        return currentPage;
    }
}
