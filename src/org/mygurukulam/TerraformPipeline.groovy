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

        stage('Terraform Plan') {
            steps {
                // Execute 'terraform plan' command
            }
        }

        stage('Terraform Apply') {
            steps {
                // Execute 'terraform apply' command
            }
        }

        // Add more stages as needed
    }

    post {
        success {
            // Cleanup or additional steps after successful execution
        }
        failure {
            // Handle failures or cleanup steps
        }
    }
}
