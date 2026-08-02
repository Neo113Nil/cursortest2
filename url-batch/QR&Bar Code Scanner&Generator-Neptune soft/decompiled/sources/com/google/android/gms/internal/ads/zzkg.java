package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkg implements zzji {
    private final zzde zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzby zze = zzby.zza;

    public zzkg(zzde zzdeVar) {
        this.zza = zzdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzji
    public final long zza() {
        long j = this.zzc;
        if (!this.zzb) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
        zzby zzbyVar = this.zze;
        return j + (zzbyVar.zzc == 1.0f ? zzen.zzv(elapsedRealtime) : zzbyVar.zza(elapsedRealtime));
    }

    public final void zzb(long j) {
        this.zzc = j;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzji
    public final zzby zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzji
    public final void zzg(zzby zzbyVar) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzbyVar;
    }
}
