package com.moloco.sdk.internal.services;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;

@StabilityInferred
/* loaded from: classes15.dex */
public final class J implements I {
    public static final int a = 0;

    @Override // com.moloco.sdk.internal.services.I
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.moloco.sdk.internal.services.I
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.moloco.sdk.internal.services.I
    @Deprecated
    public long invoke() {
        return System.currentTimeMillis();
    }
}
