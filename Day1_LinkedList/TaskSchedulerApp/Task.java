package Day1_LinkedList.TaskSchedulerApp;

class Task {
    String taskId;
    String taskName;
    int priority;
    String dueDate;

    Task(String taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}
