package org.mygurukulam.common

class GitCheckout {
    static def checkout(url, branch, creds) {
        script {
            echo "Cloning from url: ${url} of branch: ${branch} with creds: ${creds}"
            // git branch: "${branch}", url: "${url}"
        }
    }
}
