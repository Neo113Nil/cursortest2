package org.chromium.net;

/* loaded from: classes4.dex */
public abstract class QuicException extends NetworkException {
    public int getConnectionCloseSource() {
        return 0;
    }

    public abstract int getQuicDetailedErrorCode();

    protected QuicException(String str, Throwable th) {
        super(str, th);
    }
}
