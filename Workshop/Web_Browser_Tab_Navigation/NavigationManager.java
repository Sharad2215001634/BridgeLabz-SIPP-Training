package Workshop.Web_Browser_Tab_Navigation;

public interface NavigationManager {
    void openPage(String url);
    void goBack();
    void goForward();
    String getCurrentPage();
}


