package com.ironsource;

import com.ironsource.X3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.ef, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4632ef {

    @NotNull
    private EnumC4650ff a;

    public C4632ef(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = EnumC4650ff.b.a(config.optInt(X3.a.t, EnumC4650ff.CurrentlyLoadedAds.b()));
    }

    @NotNull
    public final EnumC4650ff a() {
        return this.a;
    }
}
