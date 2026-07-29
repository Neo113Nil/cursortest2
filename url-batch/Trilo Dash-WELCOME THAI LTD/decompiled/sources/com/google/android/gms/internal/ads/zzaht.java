package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaht implements zzahs {
    private final zzyv zza;
    private final zzzz zzb;
    private final zzahv zzc;
    private final zzad zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaht(zzyv zzyvVar, zzzz zzzzVar, zzahv zzahvVar, String str, int i) throws zzbp {
        this.zza = zzyvVar;
        this.zzb = zzzzVar;
        this.zzc = zzahvVar;
        int i2 = (zzahvVar.zzb * zzahvVar.zze) / 8;
        int i3 = zzahvVar.zzd;
        if (i3 != i2) {
            throw zzbp.zza("Expected block size: " + i2 + "; got: " + i3, null);
        }
        int i4 = zzahvVar.zzc * i2;
        int i5 = i4 * 8;
        int max = Math.max(i2, i4 / 10);
        this.zze = max;
        zzab zzabVar = new zzab();
        zzabVar.zzS(str);
        zzabVar.zzv(i5);
        zzabVar.zzO(i5);
        zzabVar.zzL(max);
        zzabVar.zzw(zzahvVar.zzb);
        zzabVar.zzT(zzahvVar.zzc);
        zzabVar.zzN(i);
        this.zzd = zzabVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zza(int i, long j) {
        this.zza.zzL(new zzahy(this.zzc, 1, i, j));
        this.zzb.zzk(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final boolean zzc(zzyt zzytVar, long j) throws IOException {
        long j2;
        int i;
        int i2;
        long j3 = j;
        while (j3 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int zza = zzzx.zza(this.zzb, zzytVar, (int) Math.min(i2 - i, j3), true);
            if (zza == -1) {
                j3 = 0;
            } else {
                this.zzg += zza;
                j3 -= zza;
            }
        }
        int i3 = this.zzc.zzd;
        int i4 = this.zzg / i3;
        if (i4 > 0) {
            long j4 = this.zzf;
            long zzw = zzeg.zzw(this.zzh, 1000000L, r6.zzc);
            int i5 = i4 * i3;
            int i6 = this.zzg - i5;
            this.zzb.zzs(j4 + zzw, 1, i5, i6, null);
            this.zzh += i4;
            this.zzg = i6;
            j2 = 0;
        } else {
            j2 = 0;
        }
        return j3 <= j2;
    }
}
