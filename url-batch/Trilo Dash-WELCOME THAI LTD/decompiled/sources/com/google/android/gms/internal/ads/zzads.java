package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzads implements zzadr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzads(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzads zza(long j, long j2, zzzl zzzlVar, zzdy zzdyVar) {
        int zzk;
        zzdyVar.zzG(10);
        int zze = zzdyVar.zze();
        if (zze <= 0) {
            return null;
        }
        int i = zzzlVar.zzd;
        long zzw = zzeg.zzw(zze, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int zzo = zzdyVar.zzo();
        int zzo2 = zzdyVar.zzo();
        int zzo3 = zzdyVar.zzo();
        zzdyVar.zzG(2);
        long j3 = j2 + zzzlVar.zzc;
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i2 = 0;
        long j4 = j2;
        while (i2 < zzo) {
            int i3 = zzo2;
            long j5 = j3;
            jArr[i2] = (i2 * zzw) / zzo;
            jArr2[i2] = Math.max(j4, j5);
            if (zzo3 == 1) {
                zzk = zzdyVar.zzk();
            } else if (zzo3 == 2) {
                zzk = zzdyVar.zzo();
            } else if (zzo3 == 3) {
                zzk = zzdyVar.zzm();
            } else {
                if (zzo3 != 4) {
                    return null;
                }
                zzk = zzdyVar.zzn();
            }
            j4 += zzk * i3;
            i2++;
            j3 = j5;
            zzo2 = i3;
        }
        if (j != -1 && j != j4) {
            Log.w("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new zzads(jArr, jArr2, zzw, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final long zzc(long j) {
        return this.zza[zzeg.zzd(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j) {
        int zzd = zzeg.zzd(this.zza, j, true, true);
        zzzw zzzwVar = new zzzw(this.zza[zzd], this.zzb[zzd]);
        if (zzzwVar.zzb < j) {
            long[] jArr = this.zza;
            if (zzd != jArr.length - 1) {
                int i = zzd + 1;
                return new zzzt(zzzwVar, new zzzw(jArr[i], this.zzb[i]));
            }
        }
        return new zzzt(zzzwVar, zzzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
