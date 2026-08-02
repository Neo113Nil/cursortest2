package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaiv implements zzaiu {
    private final zzzl zza;
    private final zzaap zzb;
    private final zzaix zzc;
    private final zzaf zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaiv(zzzl zzzlVar, zzaap zzaapVar, zzaix zzaixVar, String str, int i) throws zzbu {
        this.zza = zzzlVar;
        this.zzb = zzaapVar;
        this.zzc = zzaixVar;
        int i2 = (zzaixVar.zzb * zzaixVar.zze) / 8;
        int i3 = zzaixVar.zzd;
        if (i3 != i2) {
            throw zzbu.zza("Expected block size: " + i2 + "; got: " + i3, null);
        }
        int i4 = zzaixVar.zzc * i2;
        int i5 = i4 * 8;
        int max = Math.max(i2, i4 / 10);
        this.zze = max;
        zzad zzadVar = new zzad();
        zzadVar.zzS(str);
        zzadVar.zzv(i5);
        zzadVar.zzO(i5);
        zzadVar.zzL(max);
        zzadVar.zzw(zzaixVar.zzb);
        zzadVar.zzT(zzaixVar.zzc);
        zzadVar.zzN(i);
        this.zzd = zzadVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zza(int i, long j) {
        this.zza.zzN(new zzaja(this.zzc, 1, i, j));
        this.zzb.zzk(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final boolean zzc(zzzj zzzjVar, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int zza = zzaan.zza(this.zzb, zzzjVar, (int) Math.min(i2 - i, j2), true);
            if (zza == -1) {
                j2 = 0;
            } else {
                this.zzg += zza;
                j2 -= zza;
            }
        }
        int i3 = this.zzc.zzd;
        int i4 = this.zzg / i3;
        if (i4 > 0) {
            long j3 = this.zzf;
            long zzw = zzen.zzw(this.zzh, 1000000L, r1.zzc);
            int i5 = i4 * i3;
            int i6 = this.zzg - i5;
            this.zzb.zzs(j3 + zzw, 1, i5, i6, null);
            this.zzh += i4;
            this.zzg = i6;
        }
        return j2 <= 0;
    }
}
