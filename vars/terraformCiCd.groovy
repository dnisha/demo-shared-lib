def call() {
    // Your pipeline code here
    pipeline {
        agent any

        stages {
            stage('Checkout') {
                steps {
                    script {
                        org.mygurukulam.common.GitCheckout.checkout()
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
}
