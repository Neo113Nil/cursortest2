package io.ktor.utils.io.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Source;

/* compiled from: ByteReadPacket.kt */
/* loaded from: classes9.dex */
public abstract class ByteReadPacketKt {
    private static final Source ByteReadPacketEmpty = new Buffer();

    public static final long getRemaining(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return source.getBuffer().getSize();
    }

    public static final long discard(Source source, long j) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        source.request(j);
        long min = Math.min(j, getRemaining(source));
        source.getBuffer().skip(min);
        return min;
    }

    public static final void takeWhile(Source source, Function1 block) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        while (!source.exhausted() && ((Boolean) block.invoke(source.getBuffer())).booleanValue()) {
        }
    }
}
