fun main() {
    var texto = readLine()
    var listaNumerosTexto = texto!!.split(",".toRegex()).toTypedArray()
    var cantidad = listaNumerosTexto.size
    var listaNumeros = IntArray(cantidad)
    for (i in (0 until cantidad)) {
        listaNumeros[i] = listaNumerosTexto[i].toInt()
    }
    var tem = 0
    for (i in (0 until cantidad - 1)) {
        for (j in (0 until cantidad - 1)) {
            if (listaNumeros[j] > listaNumeros[j + 1]) {
                tem = listaNumeros[j]
                listaNumeros[j] = listaNumeros[j + 1]
                listaNumeros[j + 1] = tem
            }
        }
    }
    println("Lista de numeros")
    for (i in (0 until cantidad)) {
        print("${listaNumeros[i]} ")
    }
}