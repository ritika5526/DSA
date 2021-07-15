import java.util.*;
 class Doubly_linkedlist {
     Node head;
     static class Node{
         Node prev;
         Node next;
         int data;
         Node(int d){
             data = d;
         }
     }


     public static Doubly_linkedlist add_Atfirst(Doubly_linkedlist list,int value){
         Node new_node = new Node(value);

         new_node.next = list.head;
         new_node.prev = null;

         //making the prev node to point to the added(front) node
         if(list.head!=null)
         list.head.prev = new_node;

         list.head = new_node;

         return list;
     }

     public static Doubly_linkedlist add_AtLast(Doubly_linkedlist list,int value){
        Node new_node = new Node(value);

        new_node.next = null;
        Node trav = list.head;

        if(list.head == null){
            new_node.prev = null;
            list.head = new_node;
            return list;
        }
        else{
            while(trav.next!=null){
                trav = trav.next;
            }
            trav.next = new_node;
            new_node.prev = trav;
        }
        return list;
    }

    public static Doubly_linkedlist add_afterNode(Doubly_linkedlist list,int value){
       
        if(list.head == null)
        {
            System.out.println("List empty so as the element not found");
            return list;
        }
       Node trav = list.head;
       Node trav_next = list.head.next;
       int flag = 0;
       while(trav!=null){
           if(trav.data == value){
               flag = 1;
               break;
           }
           
           trav = trav.next;
           trav_next = trav_next.next;
           
       }
       if(flag ==1){
        System.out.println("Enter the new value:");
        Scanner sc = new Scanner(System.in);
        int val2 = sc.nextInt();
        Node new_node = new Node(val2);
        

        //if the present node is not the last node
        if( trav.next!=null){
            trav.next = new_node;
             new_node.prev = trav;
            new_node.next = trav_next;
            trav_next.prev = new_node;
        }
        else{
            trav.next = new_node;
             new_node.prev = trav;
            new_node.next = null;
        }

       }
       else
       System.out.println("Element not Found");


        return list;
    }

    public static Doubly_linkedlist delete(Doubly_linkedlist list,int value){
        return list;
    }

    public static void display(Doubly_linkedlist list){
        
        if(list.head == null)
        System.out.println("List empty.");
        else{
            Node trav = list.head;
            Node last = null;
            System.out.println("Traversal in forward direction");
            while(trav!=null){
                System.out.print(trav.data+" "+"->"+" ");
                last = trav;
                trav = trav.next;
            }
            System.out.println();
            System.out.println("Traversal in reverse direction");
            while(last!=null){
                System.out.print(last.data+" "+"<-"+" ");
                last = last.prev;
            }
        }
    }



     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Doubly_linkedlist list = new Doubly_linkedlist();
        while(true){
            System.out.println("\n1.Insert_atFirst   \n2.Insert_atLast \n3.Insert_afterNode \n4.Delete \n5.Display \n6.Exit");
            System.out.println("Enter your choice");
            int x = sc.nextInt();
            switch(x){
                case 1:System.out.println("Enter the element you wish to insert at first");
                int value = sc.nextInt();
                add_Atfirst(list,value);
                break;

                case 2:System.out.println("Enter the element you wish to insert at the end");
                int value1 = sc.nextInt();
                add_AtLast(list,value1);
                break;

                case 3:System.out.println("Enter the node value");
                int value2 = sc.nextInt();
                add_afterNode(list,value2);
                break;

                case 4:
                break;

                case 5:display(list);
                break;

                case 6:System.exit(0);
                return;

            }
        }   
    }
}
