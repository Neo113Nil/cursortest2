package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.la, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC5485la {
    public final C5511ma a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        if (i == 0) {
            return b(featureInfo);
        }
        return new C5511ma("openGlFeature", i, (featureInfo.flags & 1) != 0);
    }

    public abstract C5511ma b(FeatureInfo featureInfo);
}
