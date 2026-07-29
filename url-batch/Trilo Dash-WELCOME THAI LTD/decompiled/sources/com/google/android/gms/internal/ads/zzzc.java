package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzzc {
    public static zzze zzb(zzdy zzdyVar) {
        zzdyVar.zzG(1);
        int zzm = zzdyVar.zzm();
        long zzc = zzdyVar.zzc() + zzm;
        int i = zzm / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzr = zzdyVar.zzr();
            if (zzr == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzr;
            jArr2[i2] = zzdyVar.zzr();
            zzdyVar.zzG(2);
            i2++;
        }
        zzdyVar.zzG((int) (zzc - zzdyVar.zzc()));
        return new zzze(jArr, jArr2);
    }

    public static zzbl zza(zzyt zzytVar, boolean z) throws IOException {
        zzbl zza = new zzzj().zza(zzytVar, z ? null : zzacb.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
