import java.util.*;
public class Circular_linkedlist {
    Node head = null;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }

   
    public static Circular_linkedlist insert_atFirst(Circular_linkedlist list,int value){
       Node new_node = new Node(value);
       new_node.next = list.head;
       if(list.head!=null){
            Node trav = list.head;
            while(trav.next!=list.head){
                trav = trav.next;
            }
            trav.next = new_node;
       }
       else{
           new_node.next = new_node; 
       }
       list.head = new_node;
        return list;
    }

    public static Circular_linkedlist insert_atLast(Circular_linkedlist list,int value){
        Node new_node = new Node(value);
        new_node.next = list.head;

             if(list.head!=null){
                Node trav = list.head;
                while(trav.next!=list.head){
                    trav = trav.next;
                }
                trav.next = new_node;
           }
           else{
               new_node.next = new_node;
               list.head = new_node;
           }  
         return list;
     }

    public static Circular_linkedlist delete(Circular_linkedlist list,int value){
        Node present_node = list.head;
        Node prev = null;

        // to locate to the specific element
        while(present_node.data!=value){
            if(present_node.next == list.head){
                System.out.println("Element not Found");
                break;
            }
            prev = present_node;
            present_node = present_node.next;
        }

        //if only one node is present being as the element too.
        if(present_node == list.head && present_node.next == list.head){
            list.head = null;
            return list;
        }

        //if more than one node is present and check if it is the first element to be deleted
        if(present_node == list.head){
            prev = present_node;
            while(prev.next!=list.head){
                prev = prev.next;
            }
            list.head = present_node.next;
            prev.next = list.head;
        }

        //if it's the last node
        else if(present_node.next == list.head)
        prev.next = list.head;

        else
        prev.next = present_node.next;

         return list;
     }



    public static void display(Circular_linkedlist list){
        Node trav = list.head;
        if(trav == null)
        System.out.println("List empty.");
        else{

            System.out.println("Linked list:");
            do{
            System.out.print(trav.data+" "+"->"+" ");
            trav = trav.next;
        }while(trav!=list.head);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Circular_linkedlist list = new Circular_linkedlist();
        while(true){
            System.out.println("\n1.Insert_atFirst   \n2.Insert_atLast  \n3.Delete \n4.Display \n5.Exit");
            System.out.println("Enter your choice");
            int x = sc.nextInt();
            switch(x){
                case 1:System.out.println("Enter the element you wish to insert");
                int value = sc.nextInt();
                insert_atFirst(list, value);
                break;

                case 2: System.out.println("Enter the element you wish to insert");
                int value1 = sc.nextInt();
                insert_atLast(list, value1);
                break;

                case 3:System.out.println("Enter the element you wish to delete");
                int val = sc.nextInt();
                delete(list, val);
                break;

                case 4:display(list);
                break;

                case 5:System.exit(0);
                return;

            }
        }
    }
}
