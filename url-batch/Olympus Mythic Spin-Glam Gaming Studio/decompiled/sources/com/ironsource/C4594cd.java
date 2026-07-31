package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4594cd {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    @NotNull
    private final H3 c;

    public C4594cd(@NotNull JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.c = H3.Second;
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
        return this.b;
    }

    @NotNull
    public final H3 c() {
        return this.c;
    }
}
