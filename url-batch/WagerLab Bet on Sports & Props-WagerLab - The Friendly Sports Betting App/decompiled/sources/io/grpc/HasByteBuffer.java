package io.grpc;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/* loaded from: classes7.dex */
public interface HasByteBuffer {
    boolean byteBufferSupported();

    @Nullable
    ByteBuffer getByteBuffer();
}
