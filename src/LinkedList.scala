

class LinkedList(var data: String, var next: LinkedList) {
  def this() = {
    this("", null)
  }
  
  def this(data: String) = {
    this(data, null)    
  }
  
  def getData(): String =  {
    return data;
  }
  
  def setNext(data: String) = {
    this.next = new LinkedList(data, null)
  }
  
  def getNext(): LinkedList = {
    return this.next
  }
}