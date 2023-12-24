package org.mygurukulam.common

def checkout() {
    echo "cloning from url: ${url} of branch: ${branch} with creds: ${creds}"
    // git branch: "${branch}", url: "${url}"
}

return this