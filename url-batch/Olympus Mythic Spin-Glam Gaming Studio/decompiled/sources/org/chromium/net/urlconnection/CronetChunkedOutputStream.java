package org.chromium.net.urlconnection;

import java.io.IOException;
import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes5.dex */
final class CronetChunkedOutputStream extends CronetOutputStream {
    private final ByteBuffer mBuffer;
    private boolean mLastChunk;
    private final MessageLoop mMessageLoop;
    private final UploadDataProvider mUploadDataProvider = new UploadDataProviderImpl();

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    void checkReceivedEnoughContent() throws IOException {
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    boolean connectRequested() throws IOException {
        return true;
    }

    CronetChunkedOutputStream(CronetHttpURLConnection cronetHttpURLConnection, int i, MessageLoop messageLoop) {
        Objects.requireNonNull(cronetHttpURLConnection);
        if (i <= 0) {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        }
        this.mBuffer = ByteBuffer.allocate(i);
        this.mMessageLoop = messageLoop;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        ensureBufferHasRemaining();
        this.mBuffer.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        checkNotClosed();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.mBuffer.remaining());
            this.mBuffer.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            ensureBufferHasRemaining();
        }
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.mLastChunk) {
            return;
        }
        this.mLastChunk = true;
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    UploadDataProvider getUploadDataProvider() {
        return this.mUploadDataProvider;
    }

    private class UploadDataProviderImpl extends UploadDataProvider {
        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return -1L;
        }

        private UploadDataProviderImpl() {
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetChunkedOutputStream.UploadDataProviderImpl#read");
            try {
                if (byteBuffer.remaining() >= CronetChunkedOutputStream.this.mBuffer.remaining()) {
                    byteBuffer.put(CronetChunkedOutputStream.this.mBuffer);
                    uploadDataSink.onReadSucceeded(CronetChunkedOutputStream.this.mLastChunk);
                    if (!CronetChunkedOutputStream.this.mLastChunk) {
                        CronetChunkedOutputStream.this.mMessageLoop.quit();
                    }
                } else {
                    int limit = CronetChunkedOutputStream.this.mBuffer.limit();
                    byteBuffer.put(CronetChunkedOutputStream.this.mBuffer);
                    uploadDataSink.onReadSucceeded(false);
                }
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
        }
    }

    private void ensureBufferHasRemaining() throws IOException {
        if (this.mBuffer.hasRemaining()) {
            return;
        }
        uploadBufferInternal();
    }

    private void uploadBufferInternal() throws IOException {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetChunkedOutputStream#uploadBufferInternal");
        try {
            checkNotClosed();
            this.mMessageLoop.loop();
            checkNoException();
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
