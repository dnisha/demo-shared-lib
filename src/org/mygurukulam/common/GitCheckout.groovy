package org.mygurukulam.common

// class GitCheckoutScript {
def call(String url, String branch, String creds) {
    stage('Clone') {
        script {
            echo "Cloning from url: ${url} of branch: ${branch} with creds: ${creds}"
            git branch: "${branch}", url: "${url}"
        }
    }
}     
// }

// return new GitCheckoutScript()
