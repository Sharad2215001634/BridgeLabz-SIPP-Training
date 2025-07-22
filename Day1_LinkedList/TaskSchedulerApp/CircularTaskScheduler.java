package Day1_LinkedList.TaskSchedulerApp;

class CircularTaskScheduler {
    private TaskNode head = null;
    private TaskNode current = null;

    // Add at beginning
    public void addAtBeginning(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Add at end
    public void addAtEnd(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Add at position (0-based)
    public void addAtPosition(Task task, int position) {
        if (position <= 0 || head == null) {
            addAtBeginning(task);
            return;
        }

        TaskNode temp = head;
        for (int i = 0; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode newNode = new TaskNode(task);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by Task ID
    public void removeById(String taskId) {
        if (head == null) return;

        TaskNode temp = head, prev = null;
        do {
            if (temp.data.taskId.equals(taskId)) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                    if (temp == current) current = head;
                } else {
                    prev.next = temp.next;
                    if (temp == current) current = prev.next;
                }
                System.out.println("Task " + taskId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task " + taskId + " not found.");
    }

    // View current task and move to next
    public void viewCurrentAndMoveNext() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }
        printTask(current.data);
        current = current.next;
    }

    // Display all tasks from head
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        TaskNode temp = head;
        do {
            printTask(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {
        boolean found = false;
        TaskNode temp = head;
        if (temp == null) {
            System.out.println("No tasks found.");
            return;
        }

        do {
            if (temp.data.priority == priority) {
                printTask(temp.data);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No task found with priority: " + priority);
    }

    // Utility
    private void printTask(Task task) {
        System.out.printf("Task ID: %s | Name: %s | Priority: %d | Due: %s\n",
                task.taskId, task.taskName, task.priority, task.dueDate);
    }
}

