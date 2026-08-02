package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaet implements zzaes {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzaet(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzaet zza(long j, long j2, zzaab zzaabVar, zzef zzefVar) {
        int zzk;
        zzefVar.zzG(10);
        int zze = zzefVar.zze();
        if (zze <= 0) {
            return null;
        }
        int i = zzaabVar.zzd;
        long zzw = zzen.zzw(zze, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int zzo = zzefVar.zzo();
        int zzo2 = zzefVar.zzo();
        int zzo3 = zzefVar.zzo();
        zzefVar.zzG(2);
        long j3 = j2 + zzaabVar.zzc;
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
                zzk = zzefVar.zzk();
            } else if (zzo3 == 2) {
                zzk = zzefVar.zzo();
            } else if (zzo3 == 3) {
                zzk = zzefVar.zzm();
            } else {
                if (zzo3 != 4) {
                    return null;
                }
                zzk = zzefVar.zzn();
            }
            j4 += zzk * i3;
            i2++;
            jArr = jArr;
            zzo2 = i3;
            j3 = j5;
        }
        long[] jArr3 = jArr;
        if (j != -1 && j != j4) {
            zzdw.zze("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new zzaet(jArr3, jArr2, zzw, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zzc(long j) {
        return this.zza[zzen.zzd(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaaj zzg(long j) {
        int zzd = zzen.zzd(this.zza, j, true, true);
        zzaam zzaamVar = new zzaam(this.zza[zzd], this.zzb[zzd]);
        if (zzaamVar.zzb < j) {
            long[] jArr = this.zza;
            if (zzd != jArr.length - 1) {
                int i = zzd + 1;
                return new zzaaj(zzaamVar, new zzaam(jArr[i], this.zzb[i]));
            }
        }
        return new zzaaj(zzaamVar, zzaamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzh() {
        return true;
    }
}
