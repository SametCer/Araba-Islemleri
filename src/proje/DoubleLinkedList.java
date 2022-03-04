package proje;

public class DoubleLinkedList {

    private class Node {

        private Vehicle data;
        private Node next;
        private Node prev;

        public Node(Vehicle i) {
            this.data = i;
            prev = null;
            next = null;
        }

        public void displayNodeData() {
            System.out.println(data);
        }
    }

    private Node head;
    private Node tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public void ekle(Vehicle ii) {
        Node simdiki = null;
        Node eklenen = new Node(ii);
        if (head == null) {
            head = tail = eklenen;

            head.prev = null;
            tail.next = null;

        } else if (head.data.compareTo(ii) == 1) {
            eklenen.next = head;
            eklenen.next.prev = eklenen;
            head = eklenen;
        } else {
            simdiki = head;

            while (simdiki.next != null && simdiki.next.data.compareTo(ii) == -1) {
                simdiki = simdiki.next;
            }
            eklenen.next = simdiki.next;
            if (simdiki.next != null) {
                eklenen.next.prev = eklenen;//
            }
            simdiki.next = eklenen;
            eklenen.prev = simdiki;
        }
    }

    public Node sil(String ii) {
        Node bulma = head;
        while (bulma.data.getPlaka() == null ? ii != null : !bulma.data.getPlaka().equals(ii)) {
            bulma = bulma.next;
        }
        if (bulma == tail) { 
            tail = bulma.prev; 
            tail.next = null; 
        } else if (bulma == head) { 
            head = bulma.next;           
        } else {
            bulma.prev.next = bulma.next; 
            bulma.next.prev = bulma.prev; 

        }
        return bulma;
        
        
    }

  
    public void listeyazdir() {
        
        Node x = head;
        while (x != null) {
            x.displayNodeData();
            x = x.next;
        }
        System.out.println("");
    }

    public void terslisteyazdir() {
        
        Node x = head;
        Node y = tail;
        while (y.next != null) {
            y = y.next;
        }
        while (y != x) {
            y.displayNodeData();
            y = y.prev;

        }
        x.displayNodeData();
        System.out.println("");
    }

}
