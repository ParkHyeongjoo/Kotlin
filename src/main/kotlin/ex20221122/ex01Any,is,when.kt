package ex20221122

//    실행 단축키 : Shift + F10
//    코드 이동 : Shift + Alt + 방향키
//    개행 : Shift + Enter
//    한줄 복사 : Ctrl + D
//    Rename : Shift + F6
//    sout : System.out.println
//    오류난 곳으로 이동 : F2
//    자동정렬 : Ctrl + Alt + L
//    자료형 확인 : Ctrl + Shift + P

fun main() {
//    Any : 최상위 자료형 - Int, Float, String ... 모든 자료형이 될 수 있다

    var str1: String = "abc"
    str1 = "cba"
//    str1 = 123456

    var str2: Any = "abc"
    println(str2)
    str2 = 123456
    println(str2)
    str2 = 'c' // Char

//    Person p1 = new Person
//    p1
//    is Person : 상속 관계에서 어디에서 나온 필드 / 메서드 ( 프로퍼티 ) 인지 확인하기위해서 ! is 를 사용한다

//    is Int -> 정수형 자료형이 맞는지 ? 타입 체크
    when(str2){
        is Int -> println("This is Int")
        is String -> println("This is String")
        else -> println("is not Int, String")
    }



}