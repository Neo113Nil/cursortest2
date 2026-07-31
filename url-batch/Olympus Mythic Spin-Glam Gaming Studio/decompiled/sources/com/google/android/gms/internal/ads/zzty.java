package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzty implements zzto {
    protected zzty(zztx zztxVar) {
    }

    protected static int zza(int i, int i2, int i3) {
        return zzhbj.zza(((i * i2) * i3) / 1000000);
    }

    private static int zzc(int i) {
        int zzf = zzagl.zzf(i);
        zzguk.zzi(zzf != -2147483647);
        return zzf;
    }

    protected static final int zzb(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 250000;
        if (i3 == 0) {
            int zza = zza(250000, i5, i4);
            int zza2 = zza(750000, i5, i4);
            String str = zzfm.zza;
            return Math.max(zza, Math.min(i * 4, zza2));
        }
        if (i3 == 1) {
            return zzhbj.zza((zzc(i2) * 50000000) / 1000000);
        }
        if (i2 == 5) {
            i7 = 500000;
        } else if (i2 == 8) {
            i7 = 1000000;
            i2 = 8;
        }
        return zzhbj.zza((i7 * (i6 != -1 ? zzhaz.zzb(i6, 8, RoundingMode.CEILING) : zzc(i2))) / 1000000);
    }
}
