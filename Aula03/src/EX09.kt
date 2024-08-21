fun main(){

    var nome:String? = "Hyago"
    println("Olá $nome")
    nome = null
    println("Olá $nome")
    println("$nome possui ${nome.length} caracteres") //Erro de compilação

}