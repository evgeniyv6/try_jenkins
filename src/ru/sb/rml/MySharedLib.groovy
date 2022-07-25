package ru.sb.rml

class MySharedLib implements Serializable {
    def myVar

    MySharedLib() {
    }

    def printMyVar() {
        System.out.println("MyVar is ${myVar}")
    }
}