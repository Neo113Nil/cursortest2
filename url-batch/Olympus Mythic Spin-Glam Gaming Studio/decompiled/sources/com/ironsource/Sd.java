package com.ironsource;

import com.ironsource.O7;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Sd implements O7, O7.a {

    @NotNull
    private final Map<String, LevelPlayReward> a = new LinkedHashMap();

    @NotNull
    private final Map<String, LevelPlayReward> b = new LinkedHashMap();

    @Override // com.ironsource.O7.a
    public void a(@NotNull String placement, @NotNull String rewardName, int i) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.a.put(placement, new LevelPlayReward(rewardName, i));
    }

    @Override // com.ironsource.O7.a
    public void b(@NotNull String adUnitId, @NotNull String rewardName, int i) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.b.put(adUnitId, new LevelPlayReward(rewardName, i));
    }

    @Override // com.ironsource.O7
    @NotNull
    public LevelPlayReward a(@Nullable String str, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        LevelPlayReward a = a(str);
        if (a != null) {
            return a;
        }
        LevelPlayReward b = b(adUnitId);
        return b == null ? a() : b;
    }

    @Override // com.ironsource.O7
    @Nullable
    public LevelPlayReward b(@NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return this.b.get(adUnitId);
    }

    @Override // com.ironsource.O7
    @Nullable
    public LevelPlayReward a(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.a.get(str);
    }

    private final LevelPlayReward a() {
        return new LevelPlayReward("", 0);
    }
}
