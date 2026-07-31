package org.chromium.net.impl;

import androidx.annotation.RequiresExtension;
import org.chromium.net.QuicException;

@RequiresExtension
/* loaded from: classes4.dex */
class AndroidQuicExceptionWrapper extends QuicException {
    private final AndroidNetworkExceptionWrapper mBackend;

    @Override // org.chromium.net.QuicException
    public int getConnectionCloseSource() {
        return 0;
    }

    @Override // org.chromium.net.QuicException
    public int getQuicDetailedErrorCode() {
        return 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    AndroidQuicExceptionWrapper(android.net.http.QuicException quicException) {
        super(r0, quicException);
        String message;
        message = quicException.getMessage();
        this.mBackend = new AndroidNetworkExceptionWrapper(quicException, true);
    }

    @Override // org.chromium.net.NetworkException
    public int getErrorCode() {
        return this.mBackend.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public int getCronetInternalErrorCode() {
        return this.mBackend.getCronetInternalErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        return this.mBackend.immediatelyRetryable();
    }
}
