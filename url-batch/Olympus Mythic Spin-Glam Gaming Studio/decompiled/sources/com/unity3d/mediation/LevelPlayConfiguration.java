package com.unity3d.mediation;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes15.dex */
public final class LevelPlayConfiguration {
    private final boolean a;

    @Nullable
    private final String b;

    public LevelPlayConfiguration(boolean z, @Nullable String str) {
        this.a = z;
        this.b = str;
    }

    @Nullable
    public final String getAb() {
        return this.b;
    }

    public final boolean isAdQualityEnabled() {
        return this.a;
    }
}
