package io.ktor.utils.io.core;

import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.Source;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: ByteReadPacketExtensions.jvm.kt */
/* loaded from: classes4.dex */
public abstract class ByteReadPacketExtensions_jvmKt {
    public static final void read(Source source, Function1 block) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        Buffer buffer = source.getBuffer();
        if (buffer.exhausted()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        Segment head = buffer.getHead();
        Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        ByteBuffer wrap = ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos);
        Intrinsics.checkNotNull(wrap);
        block.invoke(wrap);
        int position = wrap.position() - pos;
        if (position != 0) {
            if (position < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (position > head.getSize()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            buffer.skip(position);
        }
    }
}
