package Meta

data class Student (val fullName : String, val grade : Double, val id : Int)


val students = arrayOf(
    Student("John", 140.0, 223),
    Student("Mark" , 120.0,548),
    Student( "Natali", 150.0,342,),
    Student( "Sara", 130.0,781)
)

fun getStudentById(id:Int): Student? {
    return students.find { it.id == id }!!
}

fun searchInStudents(name:String):Student? = students.find { it.fullName.lowercase() == name.lowercase() }
fun main() {
    println("Please, Enter the ID of the student: ")
    val id: Int= readln().toInt()
    val student = getStudentById(id)
    println(student)

    println("-----------------------------------------\n")

    println("Please, Enter the Name of the student: ")
    val name = readln()
    val studentName = searchInStudents(name) ?: println("The student is not found")
    println(studentName)

}