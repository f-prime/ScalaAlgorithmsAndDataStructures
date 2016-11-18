

class Queue(var next: Queue, var data: Int) {
  def this(data: Int) {
    this(null, data)
  } 
  
  def enqueue(data: Int) {
    var on = this;
    while (on.next != null) {
      on = on.next;
    }
    
    on.next = new Queue(on, data)
  }
  
  def dequeue(): Queue = {
    return this.next
 }
  
  def front(): Int = {
    return this.data
  }
  
}