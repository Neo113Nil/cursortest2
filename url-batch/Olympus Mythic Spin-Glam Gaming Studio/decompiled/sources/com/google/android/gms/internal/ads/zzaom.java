package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzaom {
    private final zzeu zza = new zzeu();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    @Nullable
    public final zzcy zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzeu zzeuVar = this.zza;
        if (zzeuVar.zze() == 0 || zzeuVar.zzg() != zzeuVar.zze() || !this.zzc) {
            return null;
        }
        zzeuVar.zzh(0);
        int i2 = this.zzh * this.zzi;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int zzs = zzeuVar.zzs();
            if (zzs != 0) {
                i = i3 + 1;
                iArr[i3] = this.zzb[zzs];
            } else {
                int zzs2 = zzeuVar.zzs();
                if (zzs2 != 0) {
                    int i4 = zzs2 & 63;
                    if ((zzs2 & 64) != 0) {
                        i4 = (i4 << 8) | zzeuVar.zzs();
                    }
                    i = i4 + i3;
                    Arrays.fill(iArr, i3, i, (zzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzeuVar.zzs()]);
                }
            }
            i3 = i;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcx zzcxVar = new zzcx();
        zzcxVar.zzc(createBitmap);
        zzcxVar.zzi(this.zzf / this.zzd);
        zzcxVar.zzj(0);
        zzcxVar.zzf(this.zzg / this.zze, 0);
        zzcxVar.zzg(0);
        zzcxVar.zzm(this.zzh / this.zzd);
        zzcxVar.zzn(this.zzi / this.zze);
        return zzcxVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    final /* synthetic */ void zzc(zzeu zzeuVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzeuVar.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i2 = i / 5;
        for (int i3 = 0; i3 < i2; i3++) {
            int zzs = zzeuVar.zzs();
            int zzs2 = zzeuVar.zzs();
            int zzs3 = zzeuVar.zzs();
            int zzs4 = zzeuVar.zzs();
            double d = zzs2;
            int zzs5 = zzeuVar.zzs() << 24;
            String str = zzfm.zza;
            double d2 = zzs3 - 128;
            double d3 = zzs4 - 128;
            iArr[zzs] = (Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)) << 16) | zzs5 | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255));
        }
        this.zzc = true;
    }

    final /* synthetic */ void zzd(zzeu zzeuVar, int i) {
        int zzx;
        if (i < 4) {
            return;
        }
        zzeuVar.zzk(3);
        int i2 = i - 4;
        if ((zzeuVar.zzs() & 128) != 0) {
            if (i2 < 7 || (zzx = zzeuVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzeuVar.zzt();
            this.zzi = zzeuVar.zzt();
            this.zza.zza(zzx - 4);
            i2 = i - 11;
        }
        zzeu zzeuVar2 = this.zza;
        int zzg = zzeuVar2.zzg();
        int zze = zzeuVar2.zze();
        if (zzg >= zze || i2 <= 0) {
            return;
        }
        int min = Math.min(i2, zze - zzg);
        zzeuVar.zzm(zzeuVar2.zzi(), zzg, min);
        zzeuVar2.zzh(zzg + min);
    }

    final /* synthetic */ void zze(zzeu zzeuVar, int i) {
        if (i < 19) {
            return;
        }
        this.zzd = zzeuVar.zzt();
        this.zze = zzeuVar.zzt();
        zzeuVar.zzk(11);
        this.zzf = zzeuVar.zzt();
        this.zzg = zzeuVar.zzt();
    }
}
