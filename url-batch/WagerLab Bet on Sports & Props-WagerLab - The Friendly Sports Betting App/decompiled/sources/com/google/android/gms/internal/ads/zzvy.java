package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzvy implements zzyp {
    public long zza;
    public long zzb;
    public zzyo zzc;
    public zzvy zzd;

    public zzvy(long j, int i) {
        zza(j, 65536);
    }

    public final void zza(long j, int i) {
        zzghc.zzh(this.zzc == null);
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    public final int zzb(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzvy zzc() {
        this.zzc = null;
        zzvy zzvyVar = this.zzd;
        this.zzd = null;
        return zzvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final zzyp zze() {
        zzvy zzvyVar = this.zzd;
        if (zzvyVar == null || zzvyVar.zzc == null) {
            return null;
        }
        return zzvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final zzyo zzd() {
        zzyo zzyoVar = this.zzc;
        zzyoVar.getClass();
        return zzyoVar;
    }
}
