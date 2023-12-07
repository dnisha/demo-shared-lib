def call(Map config = [:]) {
    def gitCheckout = new org.mygurukulam.common.CommonFuncs()
    def checkout = gitCheckout.checkout(Map config = [:])
    return checkout
}