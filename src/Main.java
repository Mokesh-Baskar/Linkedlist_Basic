public class Main {
    public static void main(String[] args) {
        Linkedlist mylinkedlist = new Linkedlist(4);
        mylinkedlist.printlist();
        mylinkedlist.append(8);
        mylinkedlist.printlist();
        mylinkedlist.remove();
        mylinkedlist.printlist();
        mylinkedlist.prepend(12);
        mylinkedlist.printlist();
        mylinkedlist.prepend(16);
        mylinkedlist.printlist();
        mylinkedlist.insert(13,2);
        mylinkedlist.printlist();
        mylinkedlist.insert(13,8);
        mylinkedlist.printlist();
        mylinkedlist.revmid(2);
        mylinkedlist.printlist();
        mylinkedlist.reverse();
        mylinkedlist.printlist();

    }



}

