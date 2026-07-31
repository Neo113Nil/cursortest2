package io.ktor.http;

import com.ironsource.B5;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: ContentTypes.kt */
/* loaded from: classes13.dex */
public abstract class ContentTypesKt {
    public static final ContentType withCharset(ContentType contentType, Charset charset) {
        Intrinsics.checkNotNullParameter(contentType, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return contentType.withParameter(B5.N, CharsetJVMKt.getName(charset));
    }

    public static final Charset charset(HeaderValueWithParameters headerValueWithParameters) {
        Intrinsics.checkNotNullParameter(headerValueWithParameters, "<this>");
        String parameter = headerValueWithParameters.parameter(B5.N);
        if (parameter == null) {
            return null;
        }
        try {
            return CharsetJVMKt.forName(Charsets.INSTANCE, parameter);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
