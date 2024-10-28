public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList myLL = new MyLinkedList();
    System.out.println(myLL.size());
    System.out.println(myLL.isEmpty());
    myLL.add("test1");
    myLL.add("test2");
    myLL.add("test3");
    myLL.add("test4");
    myLL.add("test5");
    myLL.add("test6");
    myLL.add("test7");
    myLL.add("test8");
    myLL.add("test9");
    myLL.addLast("testLast");
    myLL.addFirst("testFirst");
    System.out.println(myLL.toString());
    System.out.println(myLL.size());
    System.out.println(myLL.isEmpty());
    System.out.println(myLL.get(0));
    System.out.println(myLL.get(2));
    System.out.println(myLL.get(10));
    System.out.println(myLL.get(1));
    myLL.set(0,"newFirst");
    myLL.set(3,"newLast");
    myLL.set(2,"new3");
    System.out.println("Before Remove\n"+myLL);
    myLL.removeFirst();
    System.out.println("After Remove First\n"+myLL);
    myLL.remove(2);
    System.out.println("After Remove 2\n"+myLL);


  } // end main
  
} // end class
