package org.mygurukulam.common

def checkout(branch, creds, url) {
    echo "cloning from url: ${url} of branch: ${branch} with creds: ${creds}"
    // git branch: "${branch}", url: "${url}"
}

return this