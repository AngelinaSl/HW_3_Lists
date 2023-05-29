public class SingleLinkedList {
    Node head;

    public class Node {
        int value;
        Node next;
    }

// Метод разворота однонаправленного связного списка
    public void reverse() {
        if (head != null && head.next != null) {
            Node temp = head;
            reverse(head.next, head);
            temp.next = null;
        }
    }

    private void reverse(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            reverse(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }

    public void addToStart(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head != null) newNode.next = head;
        head = newNode;
    }

    public void addToEnd(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head == null) head = newNode;
        else {
            Node lastNode = head;
            while (lastNode.next != null) lastNode = lastNode.next;
            lastNode.next = newNode;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head != null) {
            Node preLastElement = head;
            while (preLastElement.next != null) {
                if (preLastElement.next.next == null) {
                    preLastElement.next = null;
                    return;
                }
                preLastElement = preLastElement.next;
            }
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


