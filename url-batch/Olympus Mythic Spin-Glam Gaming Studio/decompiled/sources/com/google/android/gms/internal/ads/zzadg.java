package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzadg extends zzvr {
    public zzadg(Throwable th, @Nullable zzvs zzvsVar, @Nullable Surface surface) {
        super(th, zzvsVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
