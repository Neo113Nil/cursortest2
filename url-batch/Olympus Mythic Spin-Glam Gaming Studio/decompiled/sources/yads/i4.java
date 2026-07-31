package yads;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class i4 {
    public static final void a(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        String format = String.format("Found following errors for %s ad type: %s", Arrays.copyOf(new Object[]{str, CollectionsKt.joinToString$default(arrayList, "\n - ", "\n - ", null, 0, null, null, 60, null)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        ab1.a(format, new Object[0]);
    }

    public static final void a(String str) {
        String format = String.format("Ad type %s was integrated successfully", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        ab1.b(format, new Object[0]);
    }
}
