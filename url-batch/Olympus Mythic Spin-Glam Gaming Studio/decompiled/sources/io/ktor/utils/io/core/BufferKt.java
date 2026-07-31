package io.ktor.utils.io.core;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;

/* compiled from: Buffer.kt */
/* loaded from: classes3.dex */
public abstract class BufferKt {
    public static final boolean canRead(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return !buffer.exhausted();
    }
}
