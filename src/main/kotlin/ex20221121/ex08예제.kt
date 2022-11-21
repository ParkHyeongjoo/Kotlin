package ex20221121

import kotlin.random.Random
//import java.util.*

fun main() {

    val rd = Random
//    val sc = Scanner(System.`in`)

    for (i in 1..5) {

        var num1 = rd.nextInt(9) + 1
        var num2 = rd.nextInt(9) + 1

        println("$num1 + $num2 = ? ")
        print("Enter the Answer : ")
//        var result = sc.nextInt()
//        var result = readLine()?.toInt() ?: -1
//        readLine() : String?

//        readLine을 사용하게되면 사용자는 아무 문자/숫자가 입력가능한 상태
//        toInt ---> "1234" 사용자가 무조건 숫자를 입력해야 형변환이 가능

        try{
            val answer = readLine()?.toInt()
            val result = if(num1+num2 == answer) "정답입니다." else "오답입니다."
            println("결과 : $result")
        }catch (e: NumberFormatException){
            println("숫자를 입력해주세요! 문자는 입력할 수 없습니다.")
        }

//        if ((num1 + num2) == result) println("결과 : 정답입니다") else println("결과 : 오답입니다")
//        val ans = if(num1+num2 == result) "정답입니다" else "오답입니다"
//        println("결과 : $ans")
    }

}