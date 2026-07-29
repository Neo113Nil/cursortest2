package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzazj implements zzazc {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzarw zzd = zzarw.zza;

    @Override // com.google.android.gms.internal.ads.zzazc
    public final long zzI() {
        long j = this.zzb;
        if (!this.zza) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzarw zzarwVar = this.zzd;
        return j + (zzarwVar.zzb == 1.0f ? zzard.zza(elapsedRealtime) : zzarwVar.zza(elapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final zzarw zzJ() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final zzarw zzK(zzarw zzarwVar) {
        if (this.zza) {
            zza(zzI());
        }
        this.zzd = zzarwVar;
        return zzarwVar;
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

    public final void zzd(zzazc zzazcVar) {
        zza(zzazcVar.zzI());
        this.zzd = zzazcVar.zzJ();
    }
}
