package org.mygurukulam.common

class GitCheckout {
    def checkout(branch, creds, url) {
         git branch: "${branch}", url: "${url}"
    }
}
