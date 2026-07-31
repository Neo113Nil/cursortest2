package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N5 {

    @Nullable
    private final JSONObject a;

    public N5(@Nullable JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Nullable
    public final Boolean a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof Boolean) {
            return (Boolean) opt;
        }
        return null;
    }

    @Nullable
    public final Integer b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof Integer) {
            return (Integer) opt;
        }
        return null;
    }

    @Nullable
    public final String c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof String) {
            return (String) opt;
        }
        return null;
    }
}
