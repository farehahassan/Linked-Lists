public class FirstLL {
            Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            Size++;
        }
    }
    private int Size;

    //add - First

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Size++;
        newNode.next=head;
        head=newNode;
    }

    //add - Last

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Size++;
        //traverse
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    // Print

    public void PrintList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode= currNode.next;
        }
        System.out.println("Null");
    }

    // Delete First
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty ");
            return;
        }
       Size --;
        head = head.next;
    }

    // Delete Last 

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Size--;

        if(head.next==null){
            head = null;
            return;
        }
        Node SecondLast=head;
        Node LastNode = head.next;
        while(LastNode.next!=null){
            LastNode=LastNode.next;
            SecondLast=SecondLast.next;
        }
      SecondLast.next=null;
    }
    public int getsize(){
        return Size;
    }
    public static void main(String[] args) {
        
        FirstLL list = new FirstLL();
        list.addFirst("First");
        list.addFirst("my");
        list.PrintList();
        list.addLast("Node");
        list.PrintList();
        // list.deleteFirst();
        list.deleteLast();
        list.PrintList();
        System.out.println(list.getsize());
        list.addFirst("khgsoi goi sh");
        System.out.println(list.getsize());

    }
}
