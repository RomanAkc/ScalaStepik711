

class Waiter(val name: String, val foods:List[String] = List[String]()){
  if(foods.isEmpty)
    println(s"My name $name")

  private def this(name: String, foods: List[String], x: Int) {
    this(name, foods)
  }

  def giveMe(food: String): Waiter = {
    new Waiter(name, foods :+ food, 0)
  }

  def complete(): List[String] = {
    foods;
  }
}

val waiter = new Waiter("ivan")
val positions = waiter.giveMe("borsch").giveMe("hleb").complete()

println(positions)