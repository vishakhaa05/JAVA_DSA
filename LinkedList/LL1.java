package LinkedList;
import java.util.LinkedList;
public class LL1 {
   public static void main(String args[]) {
      LinkedList<String> list = new LinkedList<String>();


      list.addFirst("vishakhaa");
      list.addFirst("name");
      list.addFirst("my");
      System.out.println(list);
     
      list.add(2, "is");
      System.out.println(list);
   }
}
 
