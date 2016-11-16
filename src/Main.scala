

object Main {
  def main(args: Array[String]) {
    testLinkedList()
    testArrayList();
  }
  
  def testLinkedList() = {
    var ll = new LinkedList("Test");
    println(ll.getData());
    println(ll.getNext());
    ll.setNext("T2");
    println(ll.getNext())
    ll = ll.getNext();
    println(ll.getData())
  }
  
  def testArrayList() = {
    var array = new ArrayList();
    var i = 0;
    for(i <- 0 to 1000) {
      array.insert(i);
    }
    println(array)
  }
  
}