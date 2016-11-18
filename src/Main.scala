

object Main {
  def main(args: Array[String]) {
    //testLinkedList()
    //testArrayList()
    //testBinaryTree()
    //testBinarySearchTree()
    testQueue()
  }
  
  def testQueue() {
    var queue = new Queue(5)
    println(queue.data)
    queue.enqueue(6)
    queue = queue.dequeue()
    println(queue.front())
  }
  
  def testBinarySearchTree() = {
     var bst = new BinarySearchTree(10)
     bst.add(5)
     bst.add(4)
     bst.add(4)
     bst.add(11)
     bst.find(113)
     var i = 0;
     for(i <- 0 to 1000) {
       val num = scala.util.Random.nextInt(101)
       //println(num)
       bst.add(num)
     }
     bst.find(100)
  }
  
  def testBinaryTree() = {
    var bt = new BinaryTree(5)
    bt.add(5);
    bt.add(5)
    bt.add(5)
    bt.add(5)
    bt.add(5)
    bt.add(5)
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