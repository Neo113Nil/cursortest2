package com.unity3d.mediation;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface LevelPlayInitListener {
    void onInitFailed(@NotNull LevelPlayInitError levelPlayInitError);

    void onInitSuccess(@NotNull LevelPlayConfiguration levelPlayConfiguration);
}
