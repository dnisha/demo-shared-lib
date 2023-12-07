def testHello() {
    def commonFuncs = new org.mygurukulam.CommonFuncs()
    def helloMessage = commonFuncs.sayHello("World")
    return helloMessage
}

def call() {
    def helloMessage = testHello()
    println helloMessage
    def commonFuncs = new org.mygurukulam.CommonFuncs()
    def hiMessage = commonFuncs.sayHi()
    return hiMessage
}

