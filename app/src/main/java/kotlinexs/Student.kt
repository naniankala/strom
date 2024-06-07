package kotlinexs

class Student(name: String, age: Int, postalAddress: String) {
    var name: String
    var age: Int
    var postalAddress: String

    init {
        val vitStudent = Student("abhay", 321, "vit")
        println("employee is getting created" + vitStudent.name)
        this.name = name
        this.age = age
        this.postalAddress = postalAddress
    }
}