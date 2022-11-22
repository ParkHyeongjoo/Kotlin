package ex20221122

fun main() {
//    label : while문에 이름을(라벨) 부여해서 break할 때 어떤 while문을 종료시킬건지 정할 수 있다.
//    continue도 동일하게 어떤 while문을 동작시킬건지 정할 수 있다.

    outer@while(true){
        println("바깥 while")
        while(true){
            println("안쪽 while")
//            조건을 만족할 경우 바깥 while문까지 종료 ... Java에서는 2가지 종료조건이 필요
//            break : 가장 가까운 반복문 한 개만 빠져나간다
            break@outer

        }
    }
}