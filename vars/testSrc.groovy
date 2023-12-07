def call() {
    def commonFuncs = new org.mygurukulam.CommonFuncs()
    echo commonFuncs.sayHi()
    echo commonFuncs.sayHello("World")
}