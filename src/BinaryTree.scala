

class BinaryTree(var left: BinaryTree, var right:BinaryTree, var data:Int) {
  def this(data: Int) {
    this(null, null, data)
  } 
  
  def this() {
    this(null, null, 0);
  }
  
  def add(data: Int) {
    recursiveAdd(this, data)    
  } 
  
  def recursiveAdd(node: BinaryTree, data: Int) {
    if (node.left == null) {
      println("Added Left")
      node.left = new BinaryTree(data)
    }
    else if(node.right == null) {
      println("Added Right")
      node.right = new BinaryTree(data)
    }
    else {
      println("Moved level down")
      recursiveAdd(node.left, data)
    }
  }
}