package all_lessons;
import java.lang.Math;


public class hometask3 {
    public static void main(String[] args){
        System.out.println("Here is demonstration of Linked List");

        SimpleLinkedList myLinkedList = new SimpleLinkedList();
        System.out.println(myLinkedList.isEmpty());
        for (int i = 0; i < 10; i++) {
            myLinkedList.insert(i, Math.round((Math.random()*100)));
        }
        System.out.println(myLinkedList.isEmpty());
        myLinkedList.display();

        SimpleLinkedList SimpleList = new SimpleLinkedList(3d, 4.6d,189.4d, 90.78d);
        SimpleLinkedList SimpleList1 = new SimpleLinkedList(3d, 4.6d,189.4d, 90.78d);
        SimpleLinkedList SimpleList2 = SimpleList;

        System.out.println(SimpleList == SimpleList1);
        System.out.println(SimpleList.equals(SimpleList1));
        System.out.println(SimpleList == SimpleList2);
        System.out.println(SimpleList.hashCode());
        System.out.println(SimpleList1.hashCode());
    }

}
