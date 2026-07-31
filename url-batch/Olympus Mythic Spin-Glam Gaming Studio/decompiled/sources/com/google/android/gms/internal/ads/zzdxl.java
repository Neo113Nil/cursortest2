package com.google.android.gms.internal.ads;

import android.view.InputEvent;
import androidx.annotation.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdxl {
    private volatile InputEvent zza;

    @VisibleForTesting
    public zzdxl() {
    }

    public final void zza(InputEvent inputEvent) {
        this.zza = inputEvent;
    }

    public final InputEvent zzb() {
        return this.zza;
    }
}
