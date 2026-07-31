package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Source;

/* compiled from: ByteChannelCtor.kt */
/* loaded from: classes4.dex */
public abstract class ByteChannelCtorKt {
    public static /* synthetic */ ByteReadChannel ByteReadChannel$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return ByteReadChannel(bArr, i, i2);
    }

    public static final ByteReadChannel ByteReadChannel(byte[] content, int i, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        Buffer buffer = new Buffer();
        buffer.write(content, i, i2 + i);
        return ByteReadChannel(buffer);
    }

    public static final ByteReadChannel ByteReadChannel(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new SourceByteReadChannel(source);
    }
}
