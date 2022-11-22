package ex20221122

fun main() {
//    Java
//    for(int i=0; i<3; i++){
//      System.out.println(i)
//    }

//    Kotlin
//    for(i in 0..2){
//      println(i)
//    }

    for (i in 1..10) println(i) // 실행코드가 한 줄 이면 중괄호 생략가능
    for (i in 1..9 step 2) { // step : 보폭
        println(i)
    }
    for (i in 10 downTo 1) { // downTo : 부등호 역방향
        println(i)
    }
    for (i in 10 downTo 2 step 2) println(i)

}