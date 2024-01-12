package org.mygurukulam.common

class GitCheckout {
    def call(String url, String branch, String creds) {
        stage('Clone') {
            steps {
                script {
                    echo "Cloning from url: ${url} of branch: ${branch} with creds: ${creds}"
                    // git branch: "${branch}", url: "${url}"
                }
            }
        }
    }     
}

return new GitCheckout()
