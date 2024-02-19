package com.example.inheritanceapp

open class Secondary: BaseClass() {

    override fun coreValues() {
        println("Core values of secondary")
    }

    override fun role() {
        println("Member from Secondary class")
    }
}