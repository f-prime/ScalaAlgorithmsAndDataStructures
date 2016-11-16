

object Main {
  def main(args: Array[String]) {
    var ll = new LinkedList("Test");
    println(ll.getData());
    println(ll.getNext());
    ll.setNext("T2");
    println(ll.getNext())
    ll = ll.getNext();
    println(ll.getData())
  }
}