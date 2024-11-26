class LL{
    Node head;

    class Node{


        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

        public void firstAdd(String data){
            Node newNode=new Node(data);
            if( head == null){
                head = newNode;
                return;
            }

            newNode.next= head;
            head = newNode;
        }

        public void lastAdd(String data){
            Node newNode=new Node(data);
            if( head == null){
                head = newNode;
                return;
            }

            Node currNode = head;
            while(currNode.next !=null){
                currNode = currNode.next;
            }

            currNode.next = newNode;
        }

        public void printLast(){
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data+"->");
                currNode = currNode.next;
            }
            System.out.print("NULL");
        }
    
    public static void main(String args[]){
        LL list = new LL();
        list.firstAdd("Hello");
        list.firstAdd("Sourabh");
        list.printLast();
        System.out.println();
        list.lastAdd("how are u");
        list.printLast();
    }
}
