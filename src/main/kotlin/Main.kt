fun main() {
    introducePerson("Leila", 20, "Kenya")
    var user = sumFourNumbers(3, 4, 5, 6)
    println(user)
    val result = calculateAverage(2.0, 5.0, 3.5, 5.7, 6.5)
    println("The average is $result")
    human("Leila Ashur",29,"0723445","leilahashur@gmail.com",57.7,false)





}
//1. Create and invoke a function that takes in a users name, age, and nationality and prints out
// “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g given “Lucy”, 23, and
// “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya” (2 points)
fun introducePerson(name: String, age: Int, nationality: String) {
    println("Hello, my name is $name, I am $age years old, and I am from $nationality.")
}


//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)


fun sumFourNumbers(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d
}
//Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun calculateAverage(a: Double, b: Double, c: Double, d: Double, e: Double): Double {
    return (a + b + c + d + e) / 5
}

//You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)


fun human(
   fullName: String,
   age: Int,
   phoneNumber: String,
    email: String,
    weight: Double,
    isUgandanCitizen: Boolean
)  {
  println(isUgandanCitizen)

}



