package kotlinx.io.bytestring;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ByteStringJvmExt.kt */
/* loaded from: classes5.dex */
public abstract class ByteStringJvmExtKt {
    public static final String decodeToString(ByteString byteString, Charset charset) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(byteString.getBackingArrayReference(), charset);
    }
}
