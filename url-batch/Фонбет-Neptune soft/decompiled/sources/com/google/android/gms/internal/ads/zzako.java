package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzako {
    private final zzek zza = new zzek();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static /* bridge */ /* synthetic */ void zzb(zzako zzakoVar, zzek zzekVar, int i) {
        int zzo;
        if (i < 4) {
            return;
        }
        zzekVar.zzL(3);
        int i2 = i - 4;
        if ((zzekVar.zzm() & 128) != 0) {
            if (i2 < 7 || (zzo = zzekVar.zzo()) < 4) {
                return;
            }
            zzakoVar.zzh = zzekVar.zzq();
            zzakoVar.zzi = zzekVar.zzq();
            zzakoVar.zza.zzH(zzo - 4);
            i2 = i - 11;
        }
        zzek zzekVar2 = zzakoVar.zza;
        int zzd = zzekVar2.zzd();
        int zze = zzekVar2.zze();
        if (zzd >= zze || i2 <= 0) {
            return;
        }
        int min = Math.min(i2, zze - zzd);
        zzekVar.zzG(zzekVar2.zzM(), zzd, min);
        zzakoVar.zza.zzK(zzd + min);
    }

    static /* bridge */ /* synthetic */ void zzc(zzako zzakoVar, zzek zzekVar, int i) {
        if (i < 19) {
            return;
        }
        zzakoVar.zzd = zzekVar.zzq();
        zzakoVar.zze = zzekVar.zzq();
        zzekVar.zzL(11);
        zzakoVar.zzf = zzekVar.zzq();
        zzakoVar.zzg = zzekVar.zzq();
    }

    static /* bridge */ /* synthetic */ void zzd(zzako zzakoVar, zzek zzekVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzekVar.zzL(2);
        int i2 = 0;
        Arrays.fill(zzakoVar.zzb, 0);
        int i3 = i / 5;
        int i4 = 0;
        while (i4 < i3) {
            int zzm = zzekVar.zzm();
            int zzm2 = zzekVar.zzm();
            int zzm3 = zzekVar.zzm();
            int zzm4 = zzekVar.zzm();
            int zzm5 = zzekVar.zzm();
            double d = zzm2;
            int[] iArr = zzakoVar.zzb;
            double d2 = zzm3 - 128;
            int max = Math.max(i2, Math.min((int) ((1.402d * d2) + d), 255)) << 16;
            double d3 = zzm4 - 128;
            iArr[zzm] = Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)) | (zzm5 << 24) | max | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
            i4++;
            i2 = 0;
        }
        zzakoVar.zzc = true;
    }

    public final zzdb zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzek zzekVar = this.zza;
        if (zzekVar.zze() == 0 || zzekVar.zzd() != zzekVar.zze() || !this.zzc) {
            return null;
        }
        zzekVar.zzK(0);
        int i2 = this.zzh * this.zzi;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int zzm = this.zza.zzm();
            if (zzm != 0) {
                i = i3 + 1;
                iArr[i3] = this.zzb[zzm];
            } else {
                int zzm2 = this.zza.zzm();
                if (zzm2 != 0) {
                    int i4 = zzm2 & 63;
                    if ((zzm2 & 64) != 0) {
                        i4 = (i4 << 8) | this.zza.zzm();
                    }
                    i = i4 + i3;
                    Arrays.fill(iArr, i3, i, (zzm2 & 128) == 0 ? this.zzb[0] : this.zzb[this.zza.zzm()]);
                }
            }
            i3 = i;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcz zzczVar = new zzcz();
        zzczVar.zzc(createBitmap);
        zzczVar.zzh(this.zzf / this.zzd);
        zzczVar.zzi(0);
        zzczVar.zze(this.zzg / this.zze, 0);
        zzczVar.zzf(0);
        zzczVar.zzk(this.zzh / this.zzd);
        zzczVar.zzd(this.zzi / this.zze);
        return zzczVar.zzp();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzH(0);
        this.zzc = false;
    }
}
