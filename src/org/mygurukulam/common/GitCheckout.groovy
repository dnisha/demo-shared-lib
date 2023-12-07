package org.mygurukulam.common

class GitCheckout {
    def checkout(branch, creds, url) {
        return git branch: "${branch}", url: "${url}"
    }
}
