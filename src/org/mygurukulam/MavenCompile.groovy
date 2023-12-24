package org.mygurukulam

def compile(dir) {
  sh "cd VotingApp/ && mvn clean package"
}

return this