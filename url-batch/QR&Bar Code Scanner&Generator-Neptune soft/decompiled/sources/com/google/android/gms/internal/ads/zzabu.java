package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzabu {
    protected final zzaap zza;

    protected zzabu(zzaap zzaapVar) {
        this.zza = zzaapVar;
    }

    protected abstract boolean zza(zzef zzefVar) throws zzbu;

    protected abstract boolean zzb(zzef zzefVar, long j) throws zzbu;

    public final boolean zzf(zzef zzefVar, long j) throws zzbu {
        return zza(zzefVar) && zzb(zzefVar, j);
    }
}
