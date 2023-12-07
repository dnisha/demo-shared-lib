def call() {
    def commonFuncs = new org.mygurukulam.CommonFuncs()
    def hiMessage = commonFuncs.sayHi()
    echo hiMessage
    def helloMessage = commonFuncs.sayHello("World")
    echo helloMessage
}