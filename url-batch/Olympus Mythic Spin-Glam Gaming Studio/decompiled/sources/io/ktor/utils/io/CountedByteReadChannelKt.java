package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountedByteReadChannel.kt */
/* loaded from: classes15.dex */
public abstract class CountedByteReadChannelKt {
    public static final CountedByteReadChannel counted(ByteReadChannel byteReadChannel) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        return new CountedByteReadChannel(byteReadChannel);
    }
}
