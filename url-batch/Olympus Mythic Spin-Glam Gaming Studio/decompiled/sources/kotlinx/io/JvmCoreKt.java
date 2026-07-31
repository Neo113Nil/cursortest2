package kotlinx.io;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: JvmCore.kt */
/* loaded from: classes12.dex */
public abstract class JvmCoreKt {
    public static final RawSource asSource(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new InputStreamSource(inputStream);
    }

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null) : false;
    }
}
