package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
abstract class zzaat {
    protected final zzzz zza;

    protected zzaat(zzzz zzzzVar) {
        this.zza = zzzzVar;
    }

    protected abstract boolean zza(zzdy zzdyVar) throws zzbp;

    protected abstract boolean zzb(zzdy zzdyVar, long j) throws zzbp;

    public final boolean zzf(zzdy zzdyVar, long j) throws zzbp {
        return zza(zzdyVar) && zzb(zzdyVar, j);
    }
}
