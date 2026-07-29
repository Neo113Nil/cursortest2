package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zztj implements zzvq {
    public long zza;
    public long zzb;
    public zzvp zzc;
    public zztj zzd;

    public zztj(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = this.zza;
        int i = this.zzc.zzb;
        return (int) (j - j2);
    }

    public final zztj zzb() {
        this.zzc = null;
        zztj zztjVar = this.zzd;
        this.zzd = null;
        return zztjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final zzvp zzc() {
        zzvp zzvpVar = this.zzc;
        Objects.requireNonNull(zzvpVar);
        return zzvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final zzvq zzd() {
        zztj zztjVar = this.zzd;
        if (zztjVar == null || zztjVar.zzc == null) {
            return null;
        }
        return zztjVar;
    }

    public final void zze(long j, int i) {
        zzcw.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }
}
