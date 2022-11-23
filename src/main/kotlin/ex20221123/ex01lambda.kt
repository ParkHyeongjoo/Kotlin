package ex20221123

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
//    람다 대수
//    수학 : 이름이 없는 함수
//           두개 이상의 수를 1개의 결과값으로 단순화
//    프로그래밍 : 다른 함수의 인자로 넘기는 함수(매개변수)
//                 함수의 결과값으로 반환하는 함수(리턴값)
//                 변수에 저장하는 함수를 의미 ***

//    매개변수 -> 리턴값
    { x: Int, y: Int -> x + y }
//    더하기 기능을 필요할 때마다 사용하려면 어딘가에 저장 : 변수

//    1. 람다식의 매개변수에 자료형이 지정되어 있다면,
//    변수에서 자료형은 생략할 수 있다.
    val sum = { x: Int, y: Int -> x + y }

//    2. 변수의 매개변수 자료형이 지정되어 있다면,
//    람다식의 자료형은 생략할 수 있다.
//    val sum: (Int, Int) -> Int = { x, y -> x + y }
    println(sum(3, 6))

//    3. 단, 람다식과 변수의 자료형을 둘 다 생략해버리면 추론이 불가능 하다.

//    val/var 변수명 : (매개변수의 자료형) -> 리턴타입 = 람다식
    //    hello라는 변수에 아래 함수를 람다식으로 담아주세요
    fun greet(): Unit {
        println("Hello Kotlin")
    }

    val hello = { println("Hello Kotlin") }

    //    다음은 정사각형의 넓이를 구하는 함수 입니다. square2 람다식으로 바꿔 주세요
    fun square1(x: Int): Int {
        return x * x
    }

    val square2 = { x: Int -> x * x }
}