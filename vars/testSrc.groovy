def call() {
    def commonFuncs = new org.mygurukulam.CommonFuncs()
    def hiMessage = commonFuncs.sayHi()
    echo hiMessage
    def sayHello = commonFuncs.sayHello("World")
    echo sayHello
}
