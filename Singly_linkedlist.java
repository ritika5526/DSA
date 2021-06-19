import java.util.*;
class Singly_linkedlist{
   
    Node head;
      static class  Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            next = null;
        }
     }

     public static Singly_linkedlist insert_last(Singly_linkedlist list, int val){
            Node new_node = new Node(val);
           new_node.next = null;

            if(list.head == null){
                list.head = new_node;
                return list;
            }
           
            else{
                Node last = list.head;
                while(last.next!=null){
                    last = last.next;
                }
                last.next = new_node;
            }
            return list;
     }

     public static Singly_linkedlist insert_First(Singly_linkedlist list,int val){
         Node new_node = new Node(val);
         new_node.next = list.head;
         list.head = new_node;
         return list;
    }

    public static  Singly_linkedlist insert_bykey(Singly_linkedlist list,int prev){
       
        Node trav = list.head;
        int flag = 0;
        while(trav!=null){
            
            if(trav.data == prev){
                flag  = 1;
                break;
            }
            trav = trav.next;
        }

        if(flag == 1){
            System.out.println("Enter the new value:");
            Scanner sc = new Scanner(System.in);
            int val2 = sc.nextInt();
            Node new_node = new Node(val2);
            new_node.next = trav.next;
            trav.next = new_node;
            return list;
        }
        else 
        System.out.println("Element not found");

        return list;
        
        
    }


    public static Singly_linkedlist del_bykey(Singly_linkedlist list,int val){
           
            Node present_node = list.head;
            Node prev = null;
            if(present_node!=null && present_node.data == val){
                list.head = present_node.next;
                System.out.println("Found and deleted.");
                return list;
            }
            while(present_node!=null && present_node.data!=val){
                prev = present_node;
                present_node = present_node.next;
            }
            if(present_node!=null)
            {
                prev.next = present_node.next;
                System.out.println("Found and Deleted.");
                return list;
            }
            if(present_node == null)
            System.out.println("Not found");

            return list;
        }

    public static Singly_linkedlist del_bypos(Singly_linkedlist list,int pos){
        Node present_node = list.head;
        Node prev = null;
        if(pos == 0 && present_node!=null){
           list.head = present_node.next;
           System.out.println("Element deleted.");
           return list;
        }
        int c = 0;
        while(present_node!=null){
            if(pos == c){
                prev.next = present_node.next;
                System.out.println(" Element Deleted");
                return list;
            }
            else{
                prev = present_node;
                present_node = present_node.next;
                c++;
            }
            
        }
        if(c == pos){
            prev  = present_node;
            System.out.println("Element deleted.");
           return list;
        }
        
        if(present_node == null)
        System.out.println("Position not found.");

        return list;
    }

    public static void display(Singly_linkedlist list){
        Node trav = list.head;
        if(trav == null)
        System.out.println("Linked list empty.");
        else{
            System.out.println("Linked list:");
            while(trav!=null){
            System.out.print(trav.data+" "+"->"+" ");
            trav = trav.next;
        }
        }
        

    }




    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Singly_linkedlist list = new Singly_linkedlist();
        while(true){
            System.out.println("Enter your choice:");
            System.out.println("\n1.Insert_last \n 2.Insert_first \n 3.Insert_Givenchoice \n 4.Delete by key \n 5.Delete by position \n 6.Display \n 7.Exit");
            int x = sc.nextInt();
            switch(x){
                case 1 : System.out.println("Enter the element at the last:");
                int value = sc.nextInt();
                insert_last(list,value);
                break;

                case 2 : System.out.println("Enter the element at the begining:");
                int val1 = sc.nextInt();
                insert_First(list,val1);
                break;

                case 3 : System.out.println("Enter the node you wish to insert the value after:");
                int ele = sc.nextInt();
                insert_bykey(list,ele);
                break;

                case 4 : System.out.println("Enter the node you wish to delete:");
                int del = sc.nextInt();
                del_bykey(list,del);
                break;

                case 5 :System.out.println("Enter the position:");
                int key = sc.nextInt();
                del_bypos(list,key);
                break;


                case 6 : display(list);
                break;

                case 7 : System.exit(0);
                return;

            }
        }
    }
}
