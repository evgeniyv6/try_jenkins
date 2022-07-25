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

    def parallRunning() {
        def mySteps = ["one", "two", "three", "four"]
        def mapToParall = [:]
        Random rnd = new Random()
        mySteps.each {
            mapToParall[it] = { ->
                this.script.echo "parall ${it} started"
                sleep(rnd.next(10))
                this.script.echo "parall ${it} ended"
            }
        }
        this.script.parallel mapToParall
    }
}