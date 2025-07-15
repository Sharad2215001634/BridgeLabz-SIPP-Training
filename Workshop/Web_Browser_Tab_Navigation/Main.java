package Workshop.Web_Browser_Tab_Navigation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nBrowser Menu:");
            System.out.println("1. Open new tab");
            System.out.println("2. Switch tab");
            System.out.println("3. Open page");
            System.out.println("4. Go back");
            System.out.println("5. Go forward");
            System.out.println("6. Show current page");
            System.out.println("7. List all tabs");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    browser.newTab();
                    break;
                case 2:
                    System.out.print("Enter tab index: ");
                    int tabIndex = scanner.nextInt();
                    browser.switchTab(tabIndex);
                    break;
                case 3:
                    System.out.print("Enter URL to open: ");
                    String url = scanner.nextLine();
                    browser.openPage(url);
                    break;
                case 4:
                    browser.goBack();
                    break;
                case 5:
                    browser.goForward();
                    break;
                case 6:
                    browser.showCurrentPage();
                    break;
                case 7:
                    browser.listTabs();
                    break;
                case 0:
                    System.out.println("Exiting browser...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        scanner.close();
    }
}
