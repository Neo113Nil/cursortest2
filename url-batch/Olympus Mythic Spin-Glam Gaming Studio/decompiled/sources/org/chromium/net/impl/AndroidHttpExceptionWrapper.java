package org.chromium.net.impl;

import android.net.http.HttpException;
import androidx.annotation.RequiresExtension;
import org.chromium.net.CronetException;

@RequiresExtension
/* loaded from: classes3.dex */
class AndroidHttpExceptionWrapper extends CronetException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    AndroidHttpExceptionWrapper(HttpException httpException) {
        super(r0, httpException);
        String message;
        message = httpException.getMessage();
    }
}
