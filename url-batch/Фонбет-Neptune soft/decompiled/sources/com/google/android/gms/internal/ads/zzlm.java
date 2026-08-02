package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzlm implements zzkg {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbq zzd = zzbq.zza;

    public zzlm(zzdj zzdjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final long zza() {
        long j = this.zzb;
        if (!this.zza) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzbq zzbqVar = this.zzd;
        return j + (zzbqVar.zzb == 1.0f ? zzet.zzr(elapsedRealtime) : zzbqVar.zza(elapsedRealtime));
    }

    public final void zzb(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final zzbq zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zze() {
        if (this.zza) {
            zzb(zza());
            this.zza = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzg(zzbq zzbqVar) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final /* synthetic */ boolean zzj() {
        throw null;
    }
}
