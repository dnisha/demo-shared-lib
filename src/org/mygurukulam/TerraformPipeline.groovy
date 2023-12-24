package org.mygurukulam

def runTerraformPipeline() {
    stage('Checkout') {
        steps {
            script {
                def z = new org.mygurukulam.Clone()
                z.checkOutFrom()
            }
        }
    }
}

return this
