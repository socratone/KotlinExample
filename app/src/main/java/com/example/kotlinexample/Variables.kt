package com.example.kotlinexample

fun main() {
    print("hello world") // 글자 출력 (js의 console.log)

    val name = "John" // 바꿀 수 없는 변수 (js의 const)
    var count = 0 // 바꿀 수 있는 변수 (js의 let)

    // 아래처럼 타입을 넣지 않아도 기본적으로 타입 추론이 된다.

    // 정수
    val myByte: Byte = 12 // 8 bit
    val myShort: Short = 123 // 16 bit
    val myInt: Int = 12345 // 32 bit
    val myLong: Long = 123_456_789 // 64 bit (숫자를 편하게 읽을 수 있도록 하는 표기법)

    // 실수
    val myFloat: Float = 12.34F // 32 bit
    val myDouble: Double = 1234.5678 // 64 bit

    // 참, 거짓
    val myBoolean: Boolean = true

    // 문자
    val myChar: Char = 'a' // 한 글자
    val myString: String = "abc" // 여러 글자
    myString[0] // myString의 첫 번째 글자
    myString[myString.length - 1] // myString의 마지막 글자
}
