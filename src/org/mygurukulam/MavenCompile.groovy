package org.mygurukulam

def compile(dir) {
  sh "cd ${dir} && mvn clean package"
}

return this