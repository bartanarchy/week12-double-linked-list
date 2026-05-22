public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();


        dll.print();

        dll.addLast(new Student("111", "Anton", "TI-1I", 3.57));
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        dll.addLast(new Student("113", "Herco", "TI-1I", 3.89));
        dll.print();

        dll.add(1, new Student("114", "Rizki", "TI-1I", 3.8));
        dll.print();

        dll.insertAfter("112", new Student("115", "Hanzel", "TI-1I", 3.6));
        dll.print();

        dll.removeAfter("111");
        dll.print();

        System.out.println("First: " + dll.getFirst().name);
        System.out.println("Last: " + dll.getLast().name);
        System.out.println("Index 1: " + dll.getIndex(1).name);

        System.out.println("Size: " + dll.getSize());

        System.out.println("Index of Hanzel: " + dll.indexOf("115"));
    }
}
