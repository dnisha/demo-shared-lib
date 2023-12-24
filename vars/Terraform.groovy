def call(Map config = [:]) {
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
                        z.checkOutFrom(config.url)
                    }
                }
            }

            stage('Deploy') {
                steps {
                    script {
                        def z = new org.mygurukulam.MavenCompile()
                        z.compile("${config.appName}/")
                    }
                }
            }
        }
    }
}
