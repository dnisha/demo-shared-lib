def call(Map config = [:]) {
    def gitCheckout = new org.mygurukulam.common.GitCheckout()
    def checkout = gitCheckout.checkout(Map config = [:])
    return checkout
}