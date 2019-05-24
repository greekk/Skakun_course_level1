package all_lessons;

public class SimpleLinkedList {
    //Node of LinkedList
   class Link{
       public int iData;
       public double Data;
       public Link next;

       public Link(int id, double dd){
           iData = id;
           Data = dd;
       }

       public void displayLink(){
           System.out.println("{" + iData + ", " + Data + "} ");
       }
   }
    //reference to the first element
    private Link first;

   //constructor
    public SimpleLinkedList(double ... args){
        if(args!= null){
            for(int i = 0; i < args.length; i++){
                this.insert(i, args[i]);
            }
        }
        else {
            first = null;
        }
    }
    //check for emptyness of list
    public boolean isEmpty(){
        return (first == null);
    }
    //insert element(node)
    public void insert(int id, double data){
        Link link = new Link(id, data);
        link.next = first;
        first = link;
    }
    //delete element
    public Link delete(){
        Link tmp = first;
        first = first.next;
        return tmp;
    }
    // display entire List
    public void display(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
    }
}

