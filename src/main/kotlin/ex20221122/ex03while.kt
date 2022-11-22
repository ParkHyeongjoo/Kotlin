package ex20221122

fun main() {
//    while(조건식){
//      조건식이 true일 동안,
//      실행시킬 코드
//    }
//    단, 조건식은 무조건 결과값으로 true, false를 반환해야함

    print("숫자를 입력하세요 : ")
    var num: Int? = readLine()?.toInt()
    var factorial: Int = 1
    if (num != null) {
        while (num > 0) {
            factorial *= num
            num--
        }
        println("결과값 : $factorial")
    }
}