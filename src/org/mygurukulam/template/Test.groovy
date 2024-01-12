package org.mygurukulam.template

import org.mygurukulam.common.*


def call(Sting branch, Sting creds, Sting url) {
    def gitCheckout = new org.mygurukulam.common.GitCheckout()

    def checkout = gitCheckout.checkout(branch, creds, url)

}
