package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class Rd {

    @Nullable
    private final String a;

    @Nullable
    private final Integer b;

    public Rd(@NotNull JSONObject features, @NotNull String nameKey, @NotNull String amountKey) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(nameKey, "nameKey");
        Intrinsics.checkNotNullParameter(amountKey, "amountKey");
        this.a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.b = features.has(amountKey) ? Integer.valueOf(features.getInt(amountKey)) : null;
    }

    @Nullable
    public final Integer a() {
        return this.b;
    }

    @Nullable
    public final String b() {
        return this.a;
    }
}
