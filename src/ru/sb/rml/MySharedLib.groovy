package ru.sb.rml

class MySharedLib implements Serializable {
    def myVar

    MySharedLib() {
    }

    def printMyVar() {
        println("MyVar is ${myVar}")
    }
}