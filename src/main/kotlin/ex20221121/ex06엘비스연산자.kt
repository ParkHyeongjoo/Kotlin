package ex20221121

fun main() {
//    엘비스 연산자 ( ?: )
//    NPE 발생을 예방할 수 있도록 NULL 값을 처리 해주는 연산자
    
    var str: String? = null

    println(str?.length ?: "null입니다")

    var result = str?.length ?: 0

    println(result)
}