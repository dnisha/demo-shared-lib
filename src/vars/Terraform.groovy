package org

class Terraform {
    def gitCheckout = new GitCheckout()

    def runTerraformPipeline() {
        node {
            stage('Checkout') {
                steps {
                    script {
                        gitCheckout.checkOutFrom("https://github.com/swapnilbamble1438/VotingApp.git")
                    }
                }
            }
        }
    }
}

return new Terraform()
