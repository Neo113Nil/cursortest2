package com.moloco.sdk.internal.ortb.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class h {
    public static final boolean a(@NotNull C5023e c5023e) {
        s experimental;
        Intrinsics.checkNotNullParameter(c5023e, "<this>");
        x xVar = c5023e.getExt().getCom.ironsource.f8.p java.lang.String();
        if (xVar == null || (experimental = xVar.getExperimental()) == null) {
            return false;
        }
        return Intrinsics.areEqual(experimental.getComposeRemovalEnabled(), Boolean.TRUE);
    }

    @NotNull
    public static final String b(@NotNull C5023e c5023e) {
        Intrinsics.checkNotNullParameter(c5023e, "<this>");
        String str = c5023e.getExt().getCom.safedk.android.analytics.brandsafety.creatives.discoveries.n.b java.lang.String();
        return str == null ? "UNKNOWN_MTID" : str;
    }
}
