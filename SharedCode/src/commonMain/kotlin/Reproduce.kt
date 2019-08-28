package com.jetbrains.handson.mpp.mobile

class Reproduce {
    fun test() {
        val plusByte = 1.toByte()
        val zeroByte = 0.toByte()
        val minusByte = (-1).toByte()
        println(plusByte) // OK
        println(zeroByte) // OK
        println(minusByte) // ERROR: EXC_BAD_ACCESS
    }
}
