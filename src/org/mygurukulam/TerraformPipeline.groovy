package org.mygurukulam

import org.mygurukulam.common.GitCheckout


def runTerraformPipeline() {
    def gitCheckout = new GitCheckout()
    node {
        stage('Checkout') {
            steps {
                script {
                    gitCheckout.checkout("demo-url", "main", "my-cred")
                }
            }
        }
    }
}
