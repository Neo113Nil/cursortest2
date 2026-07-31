package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.DefaultLoadControl;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcdc implements zzkj {
    private final zzyv zza = new zzyv(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcdc() {
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zza(zzox zzoxVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzb(zzki zzkiVar, zzwq zzwqVar, zzyf[] zzyfVarArr) {
        int i;
        this.zzf = 0;
        for (zzyf zzyfVar : zzyfVarArr) {
            if (zzyfVar != null) {
                int i2 = this.zzf;
                int i3 = zzyfVar.zza().zzc;
                if (i3 == 0) {
                    i = DefaultLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
                }
                this.zzf = i2 + i;
            }
        }
        this.zza.zzb(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzc(zzox zzoxVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzd(zzox zzoxVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final long zze(zzox zzoxVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzf(zzox zzoxVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzg(zzki zzkiVar) {
        long j = zzkiVar.zze;
        boolean z = true;
        char c = j > this.zzc ? (char) 0 : j < this.zzb ? (char) 2 : (char) 1;
        int zzg = this.zza.zzg();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zzg >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzh(zzki zzkiVar) {
        long j = zzkiVar.zzg ? this.zze : this.zzd;
        return j <= 0 || zzkiVar.zze >= j;
    }

    public final synchronized void zzj(int i) {
        this.zzb = i * 1000;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final zzyv zzk() {
        return this.zza;
    }

    public final synchronized void zzl(int i) {
        this.zzc = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zze = i * 1000;
    }

    final void zzo(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zza();
        }
    }
}
