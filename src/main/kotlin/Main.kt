fun main() {

    //1 - Como criar uma lista em Kotlin com os números de 1 a 10?
    val lista1ate10 = mutableListOf(1,2,3,4,5,6,7,8,9,10)

    //2 - Como adicionar um elemento na posição 2 de uma lista já existente em Kotlin?
    lista1ate10.add(2,30)

    //3 - Como remover o último elemento de uma lista em Kotlin?
    lista1ate10.remove(lista1ate10.get(lista1ate10.lastIndex))

    print(lista1ate10)
}


