package com.davidehrmann.vcdiff.mina_buffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface IoBufferAllocator {
    IoBuffer allocate(int i, boolean z);

    ByteBuffer allocateNioBuffer(int i, boolean z);

    void dispose();

    IoBuffer wrap(ByteBuffer byteBuffer);
}
