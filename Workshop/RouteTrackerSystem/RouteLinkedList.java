package Workshop.RouteTrackerSystem;

class RouteLinkedList<T extends Checkpoint> {
    private class Node {
        T data;
        Node next;
        Node(T data) {
            this.data = data;
        }
    }

    private Node head;

    public void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = newNode;
        }
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;

        if (head.data.getCheckpointId().equals(checkpointId)) {
            head = head.next;
            return true;
        }

        Node curr = head;
        while (curr.next != null && !curr.next.data.getCheckpointId().equals(checkpointId)) {
            curr = curr.next;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
            return true;
        }

        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node curr = head;
        while (curr != null) {
            if (curr.data.getCheckpointId().equals(checkpointId)) return curr.data;
            curr = curr.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node curr = head;
        while (curr != null) {
            total += curr.data.getDistanceFromLast();
            curr = curr.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double penalty = 0;
        Node curr = head;
        while (curr != null) {
            penalty += curr.data.calculatePenalty();
            curr = curr.next;
        }
        return penalty;
    }

    public void printRoute() {
        Node curr = head;
        int count = 1;
        while (curr != null) {
            T cp = curr.data;
            String delay = cp.isDelayed() ? "Delayed" : "On Time";
            System.out.println(count + ". " + cp.getType() + " – " + cp.locationName +
                               " – " + delay + " – Penalty: " + cp.calculatePenalty());
            count++;
            curr = curr.next;
        }
    }

    public boolean isCriticalRouteComplete() {
        boolean hasDelivery = false, hasFuel = false;
        Node curr = head;
        while (curr != null) {
            if (curr.data instanceof DeliveryCheckpoint) hasDelivery = true;
            if (curr.data instanceof FuelCheckpoint) hasFuel = true;
            curr = curr.next;
        }
        return hasDelivery && hasFuel;
    }
}
