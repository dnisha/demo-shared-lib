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
        }
    }
}
