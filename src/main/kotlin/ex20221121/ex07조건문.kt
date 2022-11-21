package ex20221121

fun main() {
//    실행코드가 한줄 인 경우 {} 생략 가능

//    단순 if문 (만약에 ~ 하면 ~ 한다)
    val gender = "남"
    if (gender == "남") println("남자입니다")

//    if else 문
    if (gender == "남") println("남자입니다") else println("여자입니다")
    val result = if (gender == "남") "남자입니다." else "여자입니다."
    println(result)
}