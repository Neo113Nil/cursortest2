package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzasc implements zzasb {
    private final zzagk zza;
    private final zzaht zzb;
    private final zzasf zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzasc(zzagk zzagkVar, zzaht zzahtVar, zzasf zzasfVar, String str, int i) throws zzat {
        this.zza = zzagkVar;
        this.zzb = zzahtVar;
        this.zzc = zzasfVar;
        int i2 = zzasfVar.zzb * zzasfVar.zze;
        int i3 = zzasfVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 28 + String.valueOf(i3).length());
            sb.append("Expected block size: ");
            sb.append(i4);
            sb.append("; got: ");
            sb.append(i3);
            throw zzat.zzb(sb.toString(), null);
        }
        int i5 = zzasfVar.zzc * i4;
        int i6 = i5 * 8;
        int max = Math.max(i4, i5 / 10);
        this.zze = max;
        zzt zztVar = new zzt();
        zztVar.zzn("audio/wav");
        zztVar.zzo(str);
        zztVar.zzi(i6);
        zztVar.zzj(i6);
        zztVar.zzp(max);
        zztVar.zzH(zzasfVar.zzb);
        zztVar.zzI(zzft.zzb(zzasfVar.zzg));
        zztVar.zzJ(zzasfVar.zzc);
        zztVar.zzK(i);
        this.zzd = zztVar.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    public final void zza(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    public final void zzb(int i, long j) {
        zzasi zzasiVar = new zzasi(this.zzc, 1, i, j);
        this.zza.zzw(zzasiVar);
        zzaht zzahtVar = this.zzb;
        zzahtVar.zzA(this.zzd);
        zzahtVar.zzP(zzasiVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    public final boolean zzc(zzagi zzagiVar, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int zza = this.zzb.zza(zzagiVar, (int) Math.min(i2 - i, j2), true);
            if (zza == -1) {
                j2 = 0;
            } else {
                this.zzg += zza;
                j2 -= zza;
            }
        }
        zzasf zzasfVar = this.zzc;
        int i3 = this.zzg;
        int i4 = zzasfVar.zzd;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long zzw = this.zzf + zzfm.zzw(this.zzh, 1000000L, zzasfVar.zzc, RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zze(zzw, 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return j2 <= 0;
    }
}
