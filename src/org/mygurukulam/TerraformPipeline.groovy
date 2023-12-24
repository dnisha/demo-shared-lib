package org.mygurukulam

import org.mygurukulam.common.GitCheckout

class TerraformPipeline {
    static def runTerraformPipeline() {
        pipeline {
            agent any

            stages {
                stage('Checkout') {
                    steps {
                        script {
                            def z = new GitCheckout()
                            z.checkout()
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
}
