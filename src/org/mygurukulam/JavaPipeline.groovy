package org.mygirukulam

class JavaPipeline {
    def static void main(String[] args) {
        pipeline {
            agent any

            stages {
                stage('Example Stage') {
                    steps {
                        script {
                            MyFunctions.sayHello()
                            MyFunctions.sayGoodbye()
                        }
                    }
                }
            }
        }
    }
}
