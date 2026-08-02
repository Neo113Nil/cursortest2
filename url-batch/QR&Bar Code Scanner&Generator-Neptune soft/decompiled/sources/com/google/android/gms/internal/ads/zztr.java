package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zztr implements zzwc {
    public long zza;
    public long zzb;
    public zzwb zzc;
    public zztr zzd;

    public zztr(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = this.zza;
        int i = this.zzc.zzb;
        return (int) (j - j2);
    }

    public final zztr zzb() {
        this.zzc = null;
        zztr zztrVar = this.zzd;
        this.zzd = null;
        return zztrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final zzwb zzc() {
        zzwb zzwbVar = this.zzc;
        Objects.requireNonNull(zzwbVar);
        return zzwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final zzwc zzd() {
        zztr zztrVar = this.zzd;
        if (zztrVar == null || zztrVar.zzc == null) {
            return null;
        }
        return zztrVar;
    }

    public final void zze(long j, int i) {
        zzdd.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }
}
