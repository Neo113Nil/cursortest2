package org.chromium.net.impl;

import androidx.annotation.RequiresExtension;
import org.chromium.net.UploadDataSink;

@RequiresExtension
/* loaded from: classes3.dex */
class AndroidUploadDataSinkWrapper extends UploadDataSink {
    private final android.net.http.UploadDataSink mBackend;

    AndroidUploadDataSinkWrapper(android.net.http.UploadDataSink uploadDataSink) {
        this.mBackend = uploadDataSink;
    }

    @Override // org.chromium.net.UploadDataSink
    public void onReadSucceeded(boolean z) {
        this.mBackend.onReadSucceeded(z);
    }

    @Override // org.chromium.net.UploadDataSink
    public void onReadError(Exception exc) {
        this.mBackend.onReadError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindSucceeded() {
        this.mBackend.onRewindSucceeded();
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindError(Exception exc) {
        this.mBackend.onRewindError(exc);
    }
}
