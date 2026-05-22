public class Node {
    Student data;
    Node next;
    Node prev;

    Node() {
    }

    Node(Student data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
    Node(Node prev, Student data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
