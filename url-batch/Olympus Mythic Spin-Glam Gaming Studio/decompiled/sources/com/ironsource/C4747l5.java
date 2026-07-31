package com.ironsource;

import com.ironsource.mediationsdk.d;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.l5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4747l5 implements Jb<String, d.a> {
    @Override // com.ironsource.Jb
    @NotNull
    public d.a a(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        d.a a = com.ironsource.mediationsdk.d.b().a(IronSourceNetworkBridge.jsonObjectInit(input));
        Intrinsics.checkNotNullExpressionValue(a, "getInstance().getAuction…sponse(JSONObject(input))");
        return a;
    }
}
