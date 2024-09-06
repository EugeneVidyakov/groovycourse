package org.example

import com.google.common.collect.ImmutableList

class HelloOtus {
    static void main(String[] args) {
        def immutableList = ImmutableList.of("Hello", "Otus")
        println immutableList
    }
}