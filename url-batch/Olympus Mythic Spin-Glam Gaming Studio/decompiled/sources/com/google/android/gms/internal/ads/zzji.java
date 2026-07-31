package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzji {
    public int zza = 1;
    public boolean zzb;
    public int zzc;

    @GuardedBy
    private int zzd;

    public final synchronized void zza() {
        this.zzd++;
    }

    public final synchronized void zzb() {
        this.zzd--;
    }

    public final synchronized int zzc() {
        return this.zzd;
    }
}
