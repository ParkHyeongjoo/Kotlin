package ex20221118

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
//    만약에 어떤 값이 정수일 수도 있고 실수일 수도 있다면 어떻게 해야할까 ???
//    Smart Cast : Compiler 가 자동으로 형변환

//    Number
    var test : Number = 1231.1244242

    println("test의 값은 $test")
    println(test::class.java.simpleName) // Double

    test = 12
    println(test::class.java.simpleName) // Integer ... Int (x) ; reference 형으로 변환

//    Any : Object랑 비슷
}
