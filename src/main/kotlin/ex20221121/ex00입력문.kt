package ex20221121

import java.util.Scanner

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

//    Scanner sc = new Scanner(System.in); - Java
    val sc = Scanner(System.`in`) // Kotlin 입력도구 가져오는 방법

//    readLint() 사용해서 런창에 입력할 수 있다
    println("readLine()을 사용한 입력 >> ")
    var num1 = readLine()?.toInt()
//    readLine()은 무조건 String?타입을 리턴

//    1. null이 발생할 수 있는 상황에 대해서 조건식 부여
    if (num1 != null) {
        println(num1 + 2)
    }

//    2. Elvis 연산자( ?: ) 사용
//    println(num1?.plus(2) ?: 실행 코드, 데이커 값)

//    3. !! 사용 지양
//    println(num1!! + 2)
}
