package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.x9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC4970x9 {
    void onAdInstanceDidBecomeVisible();

    void onAdInstanceDidClick();

    void onAdInstanceDidDismiss();

    void onAdInstanceDidFailedToShow(@NotNull IronSourceError ironSourceError);

    void onAdInstanceDidReward(@Nullable String str, int i);

    void onAdInstanceDidShow();
}
