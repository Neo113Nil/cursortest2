package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzban implements zzbag {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzata zzd = zzata.zza;

    @Override // com.google.android.gms.internal.ads.zzbag
    public final long zzI() {
        long j = this.zzb;
        if (!this.zza) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzata zzataVar = this.zzd;
        return j + (zzataVar.zzb == 1.0f ? zzash.zza(elapsedRealtime) : zzataVar.zza(elapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final zzata zzJ() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final zzata zzK(zzata zzataVar) {
        if (this.zza) {
            zza(zzI());
        }
        this.zzd = zzataVar;
        return zzataVar;
    }

    public final void zza(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    public final void zzb() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzc() {
        if (this.zza) {
            zza(zzI());
            this.zza = false;
        }
    }

    public final void zzd(zzbag zzbagVar) {
        zza(zzbagVar.zzI());
        this.zzd = zzbagVar.zzJ();
    }
}
