def call(Map config = [:]) {
    def gitCheckout = new org.mygurukulam.common.GitCheckout()
    def checkout = gitCheckout.checkout(config.branch, config.creds, config.url)
    return checkout
}