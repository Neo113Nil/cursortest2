package yads;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class ui1 {
    public static String a() {
        String lowerCase = StringsKt.replace$default(UUID.randomUUID().toString(), "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
