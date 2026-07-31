package org.chromium.net.impl;

import androidx.annotation.RequiresExtension;
import org.chromium.net.CallbackException;

@RequiresExtension
/* loaded from: classes5.dex */
class AndroidCallbackExceptionWrapper extends CallbackException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected AndroidCallbackExceptionWrapper(android.net.http.CallbackException callbackException) {
        super(r0, r2);
        String message;
        Throwable cause;
        message = callbackException.getMessage();
        cause = callbackException.getCause();
    }
}
