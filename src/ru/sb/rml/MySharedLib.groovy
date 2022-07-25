package ru.sb.rml

class MySharedLib implements Serializable {
    def myVar
    def script

    MySharedLib(def script) {
        this.script = script
    }

    def printMyVar() {
        this.script.println("MyVar is ${myVar}")
    }
}