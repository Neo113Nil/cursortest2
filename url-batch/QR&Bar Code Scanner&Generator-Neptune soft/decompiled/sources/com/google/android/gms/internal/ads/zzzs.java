package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzzs {
    public static zzzu zzb(zzef zzefVar) {
        zzefVar.zzG(1);
        int zzm = zzefVar.zzm();
        long zzc = zzefVar.zzc() + zzm;
        int i = zzm / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzr = zzefVar.zzr();
            if (zzr == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzr;
            jArr2[i2] = zzefVar.zzr();
            zzefVar.zzG(2);
            i2++;
        }
        zzefVar.zzG((int) (zzc - zzefVar.zzc()));
        return new zzzu(jArr, jArr2);
    }

    public static zzbq zza(zzzj zzzjVar, boolean z) throws IOException {
        zzbq zza = new zzzz().zza(zzzjVar, z ? null : zzadc.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
