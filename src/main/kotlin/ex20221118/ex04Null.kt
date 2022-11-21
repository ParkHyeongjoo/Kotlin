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
//    null 값을 허용하지 않는 name1을 선언 (String)
    var name1 : String = "조자연"
//    null 값을 허용하는 name2를 선언 (String?)
    var name2 : String? = null

//    name1, name2의 문자열 길이(.length)를 출력해보자
    println(name1.length)
//    println(name2.length) --> ?. or !!. 붙여주고 사용
//    name2에 오류 발생
//    원인 : null은 길이가 null 이므로 NPE가 발생
//    오류 해결 방법 : String? 형에서는 세이프콜(?.)
//    이나 non-null 단정기호 (!!.)을 사용해서 출력할 수 있다.
//    : 단정기호는 거의 사용하지 않는다. / 반드시 null값이 아니라고 판단되는 변수에만 사용가능
//    : !!. 사용할 경우 주석으로 사용한 이유 / 경위를 기록해야함!

//    ?(null값을 허용)가 붙은 변수들은 사용하려면 뒤쪽에서 계속 관리를 해줘야한다 (? : 세이프 콜)
    println(name2?.length)

//    조건문을 활용해서 null을 허용한 변수 검사
//    엘비스 연산자 (Elvis) ?: ---> SQL NVL과 비슷


}
