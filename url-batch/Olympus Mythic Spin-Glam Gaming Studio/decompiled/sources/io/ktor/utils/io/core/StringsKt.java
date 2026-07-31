package io.ktor.utils.io.core;

import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.charsets.EncodingKt;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;
import kotlinx.io.Utf8Kt;

/* compiled from: Strings.kt */
/* loaded from: classes3.dex */
public abstract class StringsKt {
    public static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return toByteArray(str, charset);
    }

    public static final byte[] toByteArray(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return Intrinsics.areEqual(charset, Charsets.UTF_8) ? kotlin.text.StringsKt.encodeToByteArray$default(str, 0, 0, true, 3, null) : CharsetJVMKt.encodeToByteArray(charset.newEncoder(), str, 0, str.length());
    }

    public static final byte[] readBytes(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return SourcesKt.readByteArray(source);
    }

    public static /* synthetic */ String readText$default(Source source, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return readText(source, charset, i);
    }

    public static final String readText(Source source, Charset charset, int i) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return EncodingKt.decode(charset.newDecoder(), source, i);
        }
        if (i == Integer.MAX_VALUE) {
            return Utf8Kt.readString(source);
        }
        return Utf8Kt.readString(source, Math.min(source.getBuffer().getSize(), i));
    }
}
