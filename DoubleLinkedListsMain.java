public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        dll.addFirst(new Student("111", "Sebian", "TI-1I", 3.97));
        dll.print();
        dll.addLast(new Student("112", "Irgi", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new Student("113", "Gesang", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new Student("114", "Akmal", "TI-1I", 3.8));
        dll.print();
        dll.insertAfter("112", new Student("115", "Desta", "TI-1I", 3.6));
        dll.print();
        dll.insertAfter("120", new Student("116", "Dava", "TI-1I", 3.4));
        dll.print();
    }
}
