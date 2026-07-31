package org.chromium.net.urlconnection;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* loaded from: classes5.dex */
abstract class CronetOutputStream extends OutputStream {
    private boolean mClosed;
    private IOException mException;
    private boolean mRequestCompleted;

    abstract void checkReceivedEnoughContent() throws IOException;

    abstract boolean connectRequested() throws IOException;

    abstract UploadDataProvider getUploadDataProvider();

    CronetOutputStream() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mClosed = true;
    }

    void setRequestCompleted(IOException iOException) {
        this.mException = iOException;
        this.mRequestCompleted = true;
    }

    protected boolean isClosed() {
        return this.mClosed;
    }

    protected void checkNotClosed() throws IOException {
        if (this.mRequestCompleted) {
            checkNoException();
            throw new IOException("Writing after request completed.");
        }
        if (this.mClosed) {
            throw new IOException("Stream has been closed.");
        }
    }

    protected void checkNoException() throws IOException {
        IOException iOException = this.mException;
        if (iOException != null) {
            throw iOException;
        }
    }
}
