package com.davidehrmann.vcdiff;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface VCDiffStreamingDecoder {
    void decodeChunk(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException;

    @Deprecated
    void decodeChunk(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException;

    void decodeChunk(byte[] bArr, OutputStream outputStream) throws IOException;

    void finishDecoding() throws IOException;

    void setAllowVcdTarget(boolean z);

    boolean setMaximumTargetFileSize(long j);

    boolean setMaximumTargetWindowSize(int i);

    void startDecoding(ByteBuffer byteBuffer);

    @Deprecated
    void startDecoding(byte[] bArr);
}
