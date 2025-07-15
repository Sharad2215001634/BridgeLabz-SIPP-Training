package Workshop.Web_Browser_Tab_Navigation;

import java.util.ArrayList;
import java.util.List;

public class Browser {
    private List<BrowserTab> tabs = new ArrayList<>();
    private int currentTabIndex = -1;

    public void newTab() {
        tabs.add(new BrowserTab());
        currentTabIndex = tabs.size() - 1;
        System.out.println("New tab opened (Tab " + currentTabIndex + ")");
    }

    public void switchTab(int index) {
        if (index >= 0 && index < tabs.size()) {
            currentTabIndex = index;
            System.out.println("Switched to tab " + index);
        } else {
            System.out.println("Invalid tab index.");
        }
    }

    public void openPage(String url) {
        if (hasActiveTab()) {
            tabs.get(currentTabIndex).openPage(url);
        }
    }

    public void goBack() {
        if (hasActiveTab()) {
            tabs.get(currentTabIndex).goBack();
        }
    }

    public void goForward() {
        if (hasActiveTab()) {
            tabs.get(currentTabIndex).goForward();
        }
    }

    public void showCurrentPage() {
        if (hasActiveTab()) {
            String page = tabs.get(currentTabIndex).getCurrentPage();
            System.out.println("Tab " + currentTabIndex + ": " + page);
        } else {
            System.out.println("No active tab.");
        }
    }

    public void listTabs() {
        if (tabs.isEmpty()) {
            System.out.println("No tabs.");
            return;
        }
        for (int i = 0; i < tabs.size(); i++) {
            String page = tabs.get(i).getCurrentPage();
            System.out.println("Tab " + i + ": " + page);
        }
    }

    private boolean hasActiveTab() {
        if (currentTabIndex == -1) {
            System.out.println("No active tab. Please open a tab first.");
            return false;
        }
        return true;
    }
}
