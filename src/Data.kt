data class Recipe(val title: String,val mainIng: String, val isVeg: Boolean = false,val dif: String = "Easy")
class Mushroom(val size: Int, val isMag: Boolean){
    constructor(isMag_p: Boolean):this (0,isMag_p)
}
/*fun findRecipes(title: String = "", ing: String = "", isVeg: Boolean = false, diff: String = ""):Array<Recipe>{
    return arrayOf(Recipe(title,ing,isVeg,diff))
}*/
fun addNum(a:Int,b:Int):Int{
    return a+b
}
fun addNum(a:Double,b:Double):Double{
    return a + b
}


fun main(){
    val r1 = Recipe("Thai Curry","Chicken")
    val r2 = Recipe(title = "Thai Curry", mainIng = "Chicken")
    val r3 = r1.copy(title = "Chicken Bhuna")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: ${r1.toString()}")
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")
    val (title,mainIng,veg,dif) = r1
    println("Title is $title and veg is $veg")
    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMag is ${m1.isMag}")
    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and isMag is ${m2.isMag}")

    println(addNum(2,5))
    println(addNum(2.4,5.6))
}