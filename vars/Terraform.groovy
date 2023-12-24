def call(String url) {
    pipeline {
        tools {
            maven "MAVEN3"
        }
        agent any

        stages {
            stage('Hello') {
                steps {
                    script {
                        echo 'Hello world'
                        def z = new org.mygurukulam.Clone()
                        z.checkOutFrom(url)
                    }
                }
            }
        }
    }
}
