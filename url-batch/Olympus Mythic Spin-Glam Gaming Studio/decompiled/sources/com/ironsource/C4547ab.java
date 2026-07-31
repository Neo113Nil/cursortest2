package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4547ab implements ImpressionDataListener {

    @NotNull
    private final LevelPlayImpressionDataListener a;

    public C4547ab(@NotNull LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = listener;
    }

    @NotNull
    public final LevelPlayImpressionDataListener a() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4547ab) {
            return Intrinsics.areEqual(this.a, ((C4547ab) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(@NotNull W8 impressionData) {
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        this.a.onImpressionSuccess(new LevelPlayImpressionData(impressionData.d()));
    }
}
