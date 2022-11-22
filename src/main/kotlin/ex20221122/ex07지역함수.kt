package ex20221122

fun main() {
    add2(5,8)

    //    println(add1(3,6)) // 컴파일 : 위에서부터 순차진행 --> 지역함수 선언 전 사용불가
    //    지역함수
    fun add1(a: Int, b: Int): Int {
        return a + b
    }
    println(add1(3, 6))
    add2(5,8)

//    최상위 레벨 함수 (Top-Level)
}//    최상위 레벨 함수 (Top-Level-Function)

fun add2(a: Int, b: Int): Int {
    return a + b
}