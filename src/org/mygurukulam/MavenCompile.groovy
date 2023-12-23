package org.mygurukulam

def compile() {
  sh "cd VotingApp/ && mvn clean package"
}

return this