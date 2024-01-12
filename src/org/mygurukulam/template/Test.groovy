package org.mygurukulam.template

import org.mygurukulam.common.*


def test(String url, String branch, String creds) {

    def gitCheckoutInstance = new org.mygurukulam.common.GitCheckout()

    gitCheckoutInstance.call(repoUrl, branch, "deepak-creds")

}

return this