//Using OOP Style to find Area of Square
class Square {
    //Properties
    private val width: Double = 5.0  // Fixed side length
    private val height: Double = 5.0  // Fixed side length

    //Lecturer TODO Find ARea
    //Member function
    fun calculateArea() {
        //multiply sides
        val area = width * height
        println("Area of Square: $area")
    }
    

    //Student to Try find Perimeter
    //Member Function
    fun calculatePerimeter() {
        //add all sides
        val perimeter = (width + height) * 2
        println("Perimeter of Square: $perimeter")
    }
}

fun main() {
    //Create your Object - instance
    val square = Square()  
    //Access memmber function
    square.calculateArea()       // Output: Area of Square: 25.0
    square.calculatePerimeter()  // Output: Perimeter of Square: 20.0
}
