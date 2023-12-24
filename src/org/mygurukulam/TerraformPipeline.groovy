// TerraformPipeline.groovy

package org.mygurukulam

import org.mygurukulam.common.GitCheckout

class TerraformPipeline {
    static def runTerraformPipeline() {
        node {
            stage('Checkout') {
                steps {
                    script {
                        GitCheckout.checkout("demo-url", "main", "my-cred")
                    }
                }
            }
        }
    }
}
