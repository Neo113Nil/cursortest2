package com.unity3d.mediation.rewarded;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class LevelPlayReward {

    @NotNull
    private final String a;
    private final int b;

    public LevelPlayReward(@NotNull String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = i;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = levelPlayReward.a;
        }
        if ((i2 & 2) != 0) {
            i = levelPlayReward.b;
        }
        return levelPlayReward.copy(str, i);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    @NotNull
    public final LevelPlayReward copy(@NotNull String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new LevelPlayReward(name, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return Intrinsics.areEqual(this.a, levelPlayReward.a) && this.b == levelPlayReward.b;
    }

    public final int getAmount() {
        return this.b;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    @NotNull
    public String toString() {
        return "LevelPlayReward(name=" + this.a + ", amount=" + this.b + ")";
    }
}
