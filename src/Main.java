public class Main {
    public static void main(String[] args) {

        SingleLinkedList my_list = new SingleLinkedList();
        my_list.addToStart(2);
        my_list.addToEnd(6);
        my_list.addToStart(4);
        my_list.addToStart(10);
        my_list.addToStart(8);

        System.out.println("Однонаправленный список:");
        my_list.printList();
        my_list.bubbleSort();

        System.out.println("\nОтсортированный однонаправленный список:");
        my_list.printList();
        my_list.reverse();

        System.out.println("\nПеревернутый отсортированный однонаправленный список:");
        my_list.printList();


        DoubleLinkedList list = new DoubleLinkedList();
        list.addToEnd(5);
        list.addToEnd(15);
        list.addToStart(25);
        list.addToEnd(10);
        list.addToEnd(20);

        System.out.println("\nДвунаправленный список:");
        list.printList();
        list.bubbleSort();

        System.out.println("\nОтсортированный двунаправленный список:");
        list.printList();
        list.reverse();

        System.out.println("\nПеревернутый двунаправленный однонаправленный список:");
        list.printList();
    }
}