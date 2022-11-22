package ex20221122

// fun 함수명(매개변수(변수명: 자료형)) : 리턴타입(작성하면 return 필요) {
//    로직(body)
// }

fun main() {

    println(sum(10, 5))

    sumPrint(10, 5)

}

//    void ---> Unit : 리턴타입지정 X
fun sumPrint(num1: Int, num2: Int): Unit {
    println(num1 + num2)
}

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}