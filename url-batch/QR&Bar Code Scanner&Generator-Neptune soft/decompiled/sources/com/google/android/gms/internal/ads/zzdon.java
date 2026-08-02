package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdon {
    private zzbmb zza;

    public zzdon(zzdoc zzdocVar) {
        this.zza = zzdocVar;
    }

    public final synchronized zzbmb zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbmb zzbmbVar) {
        this.zza = zzbmbVar;
    }
}
