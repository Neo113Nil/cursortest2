package yads;

import java.util.Arrays;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class ql3 {
    public static final Map a = MapsKt.mapOf(TuplesKt.to(ac3.c, "No ad view"), TuplesKt.to(ac3.d, "No valid ads in ad unit"), TuplesKt.to(ac3.e, "Ad is not visible for percent"), TuplesKt.to(ac3.f, "Required asset %s is not visible in ad view"), TuplesKt.to(ac3.g, "Ad view is null"), TuplesKt.to(ac3.h, "Ad view is hidden"), TuplesKt.to(ac3.i, "Visible area of an ad view is too small"));

    public static String a(bc3 bc3Var) {
        if (bc3Var == null) {
            return "Unknown error, that shouldn't happen";
        }
        String str = bc3Var.b;
        String str2 = (String) a.get(bc3Var.a);
        if (str2 == null) {
            return "Visibility error";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
