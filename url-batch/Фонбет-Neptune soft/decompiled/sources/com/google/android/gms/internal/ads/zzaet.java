package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
abstract class zzaet {
    protected final zzadp zza;

    protected zzaet(zzadp zzadpVar) {
        this.zza = zzadpVar;
    }

    protected abstract boolean zza(zzek zzekVar) throws zzbo;

    protected abstract boolean zzb(zzek zzekVar, long j) throws zzbo;

    public final boolean zzf(zzek zzekVar, long j) throws zzbo {
        return zza(zzekVar) && zzb(zzekVar, j);
    }
}
