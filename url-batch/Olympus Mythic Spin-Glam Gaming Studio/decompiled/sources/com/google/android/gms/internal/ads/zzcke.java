package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzcke implements zzmc {
    private final zzabv zza = new zzabv(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;
    private int zzf;
    private boolean zzg;

    zzcke() {
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zza(zzqj zzqjVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzb(zzmb zzmbVar, zzzr zzzrVar, zzabe[] zzabeVarArr) {
        int i;
        this.zzf = 0;
        for (zzabe zzabeVar : zzabeVarArr) {
            if (zzabeVar != null) {
                int i2 = this.zzf;
                int i3 = zzabeVar.zza().zzc;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.zzf = i2 + i;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzc(zzqj zzqjVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzd(zzqj zzqjVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final zzabp zze(zzqj zzqjVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final long zzf(zzqj zzqjVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzg(zzqj zzqjVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzh(zzmb zzmbVar) {
        long j = zzmbVar.zze;
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

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzi(zzmb zzmbVar) {
        long j = zzmbVar.zzg ? this.zze : this.zzd;
        return j <= 0 || zzmbVar.zze >= j;
    }

    public final synchronized void zzk(int i) {
        this.zzb = i * 1000;
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

    @VisibleForTesting
    final void zzo(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }
}
