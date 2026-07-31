package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5459ka extends AbstractC5485la {
    @Override // io.appmetrica.analytics.impl.AbstractC5485la
    public final C5511ma b(@NonNull FeatureInfo featureInfo) {
        return new C5511ma(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
