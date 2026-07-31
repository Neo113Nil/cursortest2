package org.chromium.net.urlconnection;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
class CronetInputStream extends InputStream {
    private static final int READ_BUFFER_SIZE = 32768;
    private ByteBuffer mBuffer;
    private IOException mException;
    private final CronetHttpURLConnection mHttpURLConnection;
    private boolean mResponseDataCompleted;

    public CronetInputStream(CronetHttpURLConnection cronetHttpURLConnection) {
        this.mHttpURLConnection = cronetHttpURLConnection;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        getMoreDataIfNeeded();
        if (hasUnreadData()) {
            return this.mBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        getMoreDataIfNeeded();
        if (!hasUnreadData()) {
            return -1;
        }
        int min = Math.min(this.mBuffer.limit() - this.mBuffer.position(), i2);
        this.mBuffer.get(bArr, i, min);
        return min;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.mResponseDataCompleted) {
            IOException iOException = this.mException;
            if (iOException == null) {
                return 0;
            }
            throw iOException;
        }
        if (hasUnreadData()) {
            return this.mBuffer.remaining();
        }
        return 0;
    }

    void setResponseDataCompleted(IOException iOException) {
        this.mException = iOException;
        this.mResponseDataCompleted = true;
        this.mBuffer = null;
    }

    private void getMoreDataIfNeeded() throws IOException {
        if (this.mResponseDataCompleted) {
            IOException iOException = this.mException;
            if (iOException != null) {
                throw iOException;
            }
        } else {
            if (hasUnreadData()) {
                return;
            }
            if (this.mBuffer == null) {
                this.mBuffer = ByteBuffer.allocateDirect(32768);
            }
            this.mHttpURLConnection.getMoreData(this.mBuffer);
            IOException iOException2 = this.mException;
            if (iOException2 != null) {
                throw iOException2;
            }
            ByteBuffer byteBuffer = this.mBuffer;
            if (byteBuffer != null) {
            }
        }
    }

    private boolean hasUnreadData() {
        ByteBuffer byteBuffer = this.mBuffer;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }
}
