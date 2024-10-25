public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList myLL = new MyLinkedList();
    System.out.println(myLL.size());
    System.out.println(myLL.isEmpty());
    myLL.add("test");
    myLL.add("test2");
    myLL.addLast("testLast");
    myLL.addFirst("testFirst");
    System.out.println(myLL.toString());
    System.out.println(myLL.size());
    System.out.println(myLL.isEmpty());
    System.out.println(myLL.get(0));
    System.out.println(myLL.get(2));
    System.out.println(myLL.get(3));
    System.out.println(myLL.get(1));
    myLL.set(0,"newFirst");
    myLL.set(3,"newLast");
    myLL.set(2,"test3");
    System.out.println(myLL);


  } // end main
  
} // end class
