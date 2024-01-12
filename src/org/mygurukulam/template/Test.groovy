package org.mygurukulam.template

import org.mygurukulam.common.*


def call(String url, String branch, String creds) {

    def gitCheckoutInstance = new org.mygurukulam.common.GitCheckout()

    gitCheckoutInstance.call(url, branch, "deepak-creds")

}
