package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
abstract class zzaiv {
    protected final zzaht zza;

    protected zzaiv(zzaht zzahtVar) {
        this.zza = zzahtVar;
    }

    protected abstract boolean zza(zzeu zzeuVar) throws zzat;

    protected abstract boolean zzb(zzeu zzeuVar, long j) throws zzat;

    public final boolean zzf(zzeu zzeuVar, long j) throws zzat {
        return zza(zzeuVar) && zzb(zzeuVar, j);
    }
}
