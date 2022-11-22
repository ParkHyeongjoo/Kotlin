package ex20221122

fun main() {

//    addList를 호출할 때마다 email이 비어있을 경우 "default" 값을 함수 전달인자로 넘겨주는 일이 매우 번거로움
//
    addList("강예진","zzo@gmail.com")
    addList("조자연")
}

// 1. 회원의 이름과 이메일 주소를 저장하는 함수
// 이메일을 입력하지 않았을 경우에 "default"라는 문자열을 저장하기로 약속
fun addList(name:String, email:String = "default"){
//    db저장..
}
// 회원가입 (firebase에서 사용할 예정)