package com.ironsource;

import com.unity3d.mediation.rewarded.LevelPlayReward;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public interface O7 {

    public interface a {
        void a(@NotNull String str, @NotNull String str2, int i);

        void b(@NotNull String str, @NotNull String str2, int i);
    }

    @Nullable
    LevelPlayReward a(@Nullable String str);

    @NotNull
    LevelPlayReward a(@Nullable String str, @NotNull String str2);

    @Nullable
    LevelPlayReward b(@NotNull String str);
}
