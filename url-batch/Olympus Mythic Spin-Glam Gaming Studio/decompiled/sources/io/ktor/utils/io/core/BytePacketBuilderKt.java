package io.ktor.utils.io.core;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;

/* compiled from: BytePacketBuilder.kt */
/* loaded from: classes11.dex */
public abstract class BytePacketBuilderKt {
    public static final int getSize(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return (int) sink.getBuffer().getSize();
    }

    public static final Sink BytePacketBuilder() {
        return new Buffer();
    }
}
