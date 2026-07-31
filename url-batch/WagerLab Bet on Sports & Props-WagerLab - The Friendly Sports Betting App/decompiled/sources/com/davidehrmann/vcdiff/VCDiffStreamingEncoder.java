package com.davidehrmann.vcdiff;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface VCDiffStreamingEncoder<OUT> {
    void encodeChunk(byte[] bArr, int i, int i2, OUT out) throws IOException;

    void encodeChunk(byte[] bArr, OUT out) throws IOException;

    void finishEncoding(OUT out) throws IOException;

    void startEncoding(OUT out) throws IOException;
}
