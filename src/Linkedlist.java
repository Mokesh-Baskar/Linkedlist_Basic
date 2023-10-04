public class Linkedlist {

    private Node head;
    private Node tail;
    public int length;

    public void printlist() {
        if (length >0){ Node temp = head;

            while(temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }

            System.out.println("This node is head" +" " + head.value);
            System.out.println("This node is tail" +" " +tail.value);
            System.out.println(length);
        }

    }

    public void append(int value) {

        Node newnode = new Node(value);
        tail.next=newnode;
        tail=newnode;
        length=length+1;
    }

    public void remove() {
        Node temp = head;
        if (length>0){
            while (temp.next!=tail){
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;
            length = length-1;

        }else{
            System.out.println("list is empty");
        }


    }

    public void prepend(int value) {
        Node newnode= new Node(value);
        newnode.next=head;
        head=newnode;
        length+=1;

    }

    public void insert(int value, int index) {
        Node temp=head;
        if (index>length){
            append(value);
        }else {
            Node newnode= new Node(value);
            for (int i=1;i<index-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            length+=1;
        }

    }

    public void revmid(int index) {
        if (index>length){
            System.out.println("Index is greater than linkedlist length");
            return;
        } else if (index==length) {
            remove();
        }else{
            Node temp=head;
            Node prev=head;
            for (int i=1; i<index-1;i++){
                temp=temp.next;
                prev=prev.next;
            }
            temp=temp.next;
            prev.next=temp.next;
            temp.next=null;
            length-=1;
        }
    }

    public void reverse() {
        Node temp=head;
        Node before=null;
        Node after=head.next;
        head=tail;
        tail=temp;
        for(int i = 0; i<length; i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
            next = null;
        }
    }
    public Linkedlist(int value){
        Node newnode = new Node(value);
        head=newnode;
        tail=newnode;
        length=1;
    }
}
