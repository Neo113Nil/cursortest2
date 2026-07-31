package org.chromium.net.impl;

import androidx.annotation.RequiresExtension;
import org.chromium.net.NetworkException;

@RequiresExtension
/* loaded from: classes15.dex */
class AndroidNetworkExceptionWrapper extends NetworkException {
    private final android.net.http.NetworkException mBackend;

    @Override // org.chromium.net.NetworkException
    public int getCronetInternalErrorCode() {
        return -1;
    }

    AndroidNetworkExceptionWrapper(android.net.http.NetworkException networkException) {
        this(networkException, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    AndroidNetworkExceptionWrapper(android.net.http.NetworkException networkException, boolean z) {
        super(r0, networkException);
        String message;
        message = networkException.getMessage();
        this.mBackend = networkException;
        if (!z && AndroidNetworkExceptionWrapper$$ExternalSyntheticApiModelOutline2.m(networkException)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
        }
    }

    @Override // org.chromium.net.NetworkException
    public int getErrorCode() {
        int errorCode;
        errorCode = this.mBackend.getErrorCode();
        return errorCode;
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        boolean isImmediatelyRetryable;
        isImmediatelyRetryable = this.mBackend.isImmediatelyRetryable();
        return isImmediatelyRetryable;
    }
}
