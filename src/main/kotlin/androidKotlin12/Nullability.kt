package androidKotlin12

fun main() {
    var name = "Nola"
    // name = null -> COMPILATION ERROR
    var nullableName: String? = "Denis"


    var len = name.length
    var len2 = nullableName?.length
    // Safe call opertaor ?
    println(nullableName?.lowercase())
    // alternatively:
    // nullabbleName?.let {println(it.length)}
    // Its like an if Else

//    the Below code is the same as saying  "var len2 = nullableName?.length"
    /*  if (nullableName != null){
           var len2 = nullableName.length
        } else {
            null
        } */


}