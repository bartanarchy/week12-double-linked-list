public class DoubleLinkedLists {
    Node head;
    Node tail;

    DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void add(int index, Student data) {
        if (index < 0 || index > getSize()) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == getSize()) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            newNode.prev = temp.prev;
            newNode.next = temp;
            temp.prev.next = newNode;
            temp.prev = newNode;
        }
    }

    void insertAfter(String key, Student data) {
        Node newNode = new Node(data);
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                found = true;
                if (temp == tail) {
                    addLast(data);
                } else {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
                break;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Insertion failed. Data (" + key + ") not found.");
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return;
        }
        if (index < 0) {
            System.out.println("Invalid index. Must be non-negative.");
            return;
        }
        int size = getSize();
        if (index >= size) {
            System.out.println("Invalid index. Exceeds list size.");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    void removeAfter(String key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp.next == null) {
                    System.out.println("No node exists after " + key);
                } else if (temp.next == tail) {
                    removeLast();
                } else {
                    Node toRemove = temp.next;
                    temp.next = toRemove.next;
                    toRemove.next.prev = temp;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Key (" + key + ") not found.");
    }

    Student getFirst() {
        if (isEmpty()) return null;
        return head.data;
    }

    Student getLast() {
        if (isEmpty()) return null;
        return tail.data;
    }

    Student getIndex(int index) {
        if (index < 0 || index >= getSize()) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    int indexOf(String key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1; // not found
    }

    void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Double Linked List is currently empty.");
        }
    }
}
