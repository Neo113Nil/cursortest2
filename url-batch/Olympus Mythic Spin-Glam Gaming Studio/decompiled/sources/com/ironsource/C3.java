package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class C3 {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    @Nullable
    private final H3 c;

    public C3(@NotNull JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.b = features.has("maxImpressions") ? Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.c = features.has("unit") ? H3.c.a(features.optString("unit")) : null;
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
        return this.b;
    }

    @Nullable
    public final H3 c() {
        return this.c;
    }
}
