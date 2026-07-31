package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5433ja extends AbstractC5485la {
    @Override // io.appmetrica.analytics.impl.AbstractC5485la
    @TargetApi(24)
    public final C5511ma b(@NonNull FeatureInfo featureInfo) {
        return new C5511ma(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
