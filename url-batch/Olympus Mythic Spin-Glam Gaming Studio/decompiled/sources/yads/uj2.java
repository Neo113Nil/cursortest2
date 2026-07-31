package yads;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes6.dex */
public final class uj2 {
    public static String a(long j) {
        long ceil = (long) Math.ceil(j / 1000);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(ceil / 60), Long.valueOf(ceil % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
