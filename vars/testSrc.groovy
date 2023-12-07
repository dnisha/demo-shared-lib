def call() {
    def commonFuncs = new org.mygurukulam.CommonFuncs()
    def hiMessage = commonFuncs.sayHi()
    return hiMessage
}

def call() {
    def commonFuncs = new org.mygurukulam.CommonFuncs()
    def sayHello = commonFuncs.sayHello()
    return sayHello
}