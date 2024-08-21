fun main(){

    var s:Any = "Hyago"
    println(s as String)
    println(s as? Int)
    if (s is String){
        println("$s é um")
    }

}