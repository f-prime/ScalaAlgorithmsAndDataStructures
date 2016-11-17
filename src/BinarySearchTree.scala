

class BinarySearchTree(var left: BinarySearchTree, var right: BinarySearchTree, var data: Int) {
  def this(data: Int) {
    this(null, null, data)
  }
  
  def add(toAdd: Int) {
    recursiveAdd(this, toAdd)    
  }
  
  def find(toFind: Int) {
    println(recursiveFind(this, toFind))
  }
  
  def recursiveFind(node: BinarySearchTree, toFind: Int): Boolean = {
    if(toFind == node.data) {
      return true
    } else if(toFind > node.data) {
      if (node.right == null) {
        return false
      } else {
        return recursiveFind(node.right, toFind)
      }
    } else if(toFind < node.data) {
      if(node.left == null) {
        return false
      } else {
        return recursiveFind(node.left, toFind)
      }
    }
    return false
  }
  
  def recursiveAdd(node: BinarySearchTree, toAdd: Int) {
    if(toAdd >= node.data) {
      if(node.right == null) {
        node.right = new BinarySearchTree(toAdd)
      }
      else {
        recursiveAdd(node.right, toAdd)
      }
    } else if(toAdd < node.data) {
      if (node.left == null) {
        node.left = new BinarySearchTree(toAdd)
      }
      else { 
        recursiveAdd(node.left, toAdd)
      }
    }
  }
}