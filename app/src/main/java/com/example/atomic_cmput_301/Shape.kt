package com.example.atomic_cmput_301

abstract class Shape {
    open val x: Int = 0
    open val y: Int = 0
}

class Star : Shape()