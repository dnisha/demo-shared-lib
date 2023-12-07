def call(Map config = [:]) {
    def gitCheckout = new org.mygurukulam.common.GitCheckout()
    def checkout = gitCheckout.checkout(config.url, config.creds, config.branch)
    return checkout
}