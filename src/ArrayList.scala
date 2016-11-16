

class ArrayList {
  var size = 5;
  var indexOn = 0;
  var array: Array[Int] = new Array[Int](size)
  
  def insert(item: Int) {
    if(indexOn == size) {
      this.expandArray();
    }
    array(indexOn) = item;
    indexOn += 1
  }
  
  def expandArray() {
    this.size *= 2
    var newArray: Array[Int] = new Array[Int](size);
    var i = 0
    for(i <- 0 until array.length) {
      newArray(i) = array(i);
    }
    this.array = newArray
  }
  
  def get(index: Int): Int = {
    return this.array(index);
  }
  
  override def toString(): String = {
    var out: String = "["
    var i = 0
    for(i <- 0 until indexOn - 1) {
      out += array(i) + ", "
    }
    out += array(indexOn - 1)
    out += "]"
    return out
  }
}