package io.ktor.utils.io;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ByteReadChannel.kt */
/* loaded from: classes4.dex */
public abstract class ByteReadChannelKt {
    public static final void cancel(ByteReadChannel byteReadChannel) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        byteReadChannel.cancel(new IOException("Channel was cancelled"));
    }
}
