package org.msgpack.value;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public interface RawValue extends Value {
    byte[] asByteArray();

    ByteBuffer asByteBuffer();

    String asString();

    String toString();
}
