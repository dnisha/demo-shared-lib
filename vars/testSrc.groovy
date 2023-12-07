def call(Map config = [:]) {
    def helloMessage = testHello(config.name)
    println helloMessage
    def commonFuncs = new org.mygurukulam.CommonFuncs()
    def hiMessage = commonFuncs.sayHi()
    return hiMessage
}

def testHello(Sting name) {
    def commonFuncs = new org.mygurukulam.CommonFuncs()
    def helloMessage = commonFuncs.sayHello(name)
    return helloMessage
}
