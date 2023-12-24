package org.mygurukulam

import org.mygurukulam.Clone

def runTerraformPipeline() {
    node {
        stage('Checkout') {
            steps {
                script {
                    def z = new org.mygurukulam.Clone()
                    z.checkOutFrom()
                }
            }
        }
    }
}