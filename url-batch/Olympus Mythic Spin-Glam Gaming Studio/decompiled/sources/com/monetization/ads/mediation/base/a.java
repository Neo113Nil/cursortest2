package com.monetization.ads.mediation.base;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes15.dex */
public abstract class a {
    @Nullable
    public MediatedAdObject getAdObject() {
        return null;
    }

    @NotNull
    public MediatedAdapterInfo getAdapterInfo() {
        return new MediatedAdapterInfo.Builder().build();
    }

    public boolean getShouldTrackImpressionAutomatically() {
        return true;
    }
}
