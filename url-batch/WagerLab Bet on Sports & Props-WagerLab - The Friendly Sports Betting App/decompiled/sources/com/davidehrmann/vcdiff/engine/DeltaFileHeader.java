package com.davidehrmann.vcdiff.engine;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
class DeltaFileHeader {
    public static final int SERIALIZED_SIZE = 5;
    public final byte hdr_indicator;
    public final byte header1;
    public final byte header2;
    public final byte header3;
    public final byte header4;

    public DeltaFileHeader(ByteBuffer byteBuffer) {
        this.header1 = byteBuffer.get();
        this.header2 = byteBuffer.get();
        this.header3 = byteBuffer.get();
        this.header4 = byteBuffer.get();
        this.hdr_indicator = byteBuffer.get();
    }
}
