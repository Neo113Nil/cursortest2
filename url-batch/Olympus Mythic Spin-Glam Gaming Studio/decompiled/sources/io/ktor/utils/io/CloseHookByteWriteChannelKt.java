package io.ktor.utils.io;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CloseHookByteWriteChannel.kt */
/* loaded from: classes15.dex */
public abstract class CloseHookByteWriteChannelKt {
    public static final ByteWriteChannel onClose(ByteWriteChannel byteWriteChannel, Function1 onClose) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        return new CloseHookByteWriteChannel(byteWriteChannel, onClose);
    }
}
