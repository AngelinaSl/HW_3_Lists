public class DoubleLinkedList {

    Node head;
    Node tail;

    public class Node {
        int value;
        Node next;
        Node previous;
    }

    // Метод разворота двунаправленного связного списка
    public void reverse() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null)
                tail = currentNode;

            if (next == null)
                head = currentNode;

            currentNode = next;
        }
    }

    public void addToStart(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head != null) {
            newNode.next = head;
            head.previous = newNode;
        } else tail = newNode;
        head = newNode;
    }


    public void addToEnd(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head == null) {
            head = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
        }
        tail = newNode;
    }
        public void removeFirst() {
        if (head != null && head.next != null) {
            head = head.next;
            head.previous = null;
        } else {
            head = null;
            tail = null;
        }
    }

    public void removeLast() {
        if (head != null && head.next != null) {
            tail = tail.previous;
            tail.next = null;
        } else {
            tail = null;
            head = null;
        }
    }

    public boolean find(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public void bubbleSort() {
        boolean sort = true;
        while (sort) {
            sort = false;
            Node i = head;
            while (i != null && i.next != null) {
                if (i.value > i.next.value) {
                    int tmp = i.value;
                    i.value = i.next.value;
                    i.next.value = tmp;
                    sort = true;
                }
                i = i.next;
            }
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}












