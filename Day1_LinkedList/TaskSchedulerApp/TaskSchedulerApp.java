package Day1_LinkedList.TaskSchedulerApp;

public class TaskSchedulerApp {
    public static void main(String[] args) {
        CircularTaskScheduler scheduler = new CircularTaskScheduler();

        scheduler.addAtEnd(new Task("T1", "Deliver Package", 2, "2025-07-23"));
        scheduler.addAtBeginning(new Task("T2", "Refuel", 1, "2025-07-22"));
        scheduler.addAtPosition(new Task("T3", "Check Tires", 3, "2025-07-24"), 1);
        scheduler.addAtEnd(new Task("T4", "Wash Vehicle", 2, "2025-07-25"));

        System.out.println("\nAll Tasks:");
        scheduler.displayAllTasks();

        System.out.println("\nCurrent Task (and Move to Next):");
        scheduler.viewCurrentAndMoveNext();

        System.out.println("\nCurrent Task (and Move to Next):");
        scheduler.viewCurrentAndMoveNext();

        System.out.println("\nSearch by Priority 2:");
        scheduler.searchByPriority(2);

        System.out.println("\nRemoving Task T3:");
        scheduler.removeById("T3");

        System.out.println("\nAll Tasks After Removal:");
        scheduler.displayAllTasks();
    }
}
