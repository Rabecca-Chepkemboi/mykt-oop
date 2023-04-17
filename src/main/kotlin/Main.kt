

fun main(){
    var x = Person("Clarah", 27)
    x.printInfo()


    var y = Rectangle(46.7, 78.9)
    var area = y.getArea()
    println(area)


    var d = Employee("Chalse", 1200.45, "casual")
    println("current salary: ${d.salary}")
    d.increaseSalary(30.0)
    println("new salary: ${d.salary}")


    val account = BankAccount(100.0, "123456")
    account.deposit(60.6)
    account.withdraw(25.4)
    println(account.balance)


}


// 1. Create a class Person with properties name and age. Add a method
//printInfo to print out the person's name and age.

class Person(var name: String, var age: Int){
    fun printInfo(){
        println("$name is now $age years old")
    }
}


// 2. Create a class Rectangle with properties width and height. Add a method
//getArea to calculate the area of the rectangle.

class Rectangle(var width: Double, var height: Double) {

    fun getArea(): Double {
        return width * height
    }
}


// 3. Create a class Employee with properties name, salary, and department. Add a method
//raiseSalary that increases the employee's salary by a given percentage.

class Employee(var name: String, var salary: Double, var department: String ){
    fun increaseSalary(percent: Double){
        salary += salary * (percent / 100)

    }
}


// 4. Create a class BankAccount with properties balance and accountNumber. Add methods
//deposit and withdraw to modify the account balance.

class BankAccount(var balance: Double, var accountNumber: String){
    fun deposit(amount: Double){
        balance += amount
    }
    fun withdraw(amount: Double){
        balance -= amount
    }
}



//                       SOME OF THE TAKEAWAY KEYS INCLUDE
// 1. instances of classes. In Kotlin, you define a class using the 'class' keyword.
//
// 2. Constructors: Constructors are special functions that are called when an object is created. In Kotlin, you can have one primary constructor and one or more secondary.
//
// 3. Constructors.Functions: Functions are used to perform a specific task. In Kotlin, you can define functions inside a class using the 'fun' keyword.








