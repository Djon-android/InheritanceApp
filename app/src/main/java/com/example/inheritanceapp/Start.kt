package com.example.inheritanceapp

fun main() {
    val obj1 = BaseClass()
    obj1.coreValues()
    obj1.role()

    val obj2 = Secondary()
    obj2.coreValues()
    obj2.role()

    val obj3 = Tertiary()
    obj3.role()

    val obj4 = Offspring()
    obj4.role()
    obj4.archery()
    obj4.sing()
    obj4.coreValues()
}