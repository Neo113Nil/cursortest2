package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
abstract class zziia {
    private static volatile int zza = 100;

    zziia() {
    }

    abstract void zza(Object obj, int i, long j);

    abstract void zzb(Object obj, int i, int i2);

    abstract void zzc(Object obj, int i, long j);

    abstract void zzd(Object obj, int i, zziei zzieiVar);

    abstract void zze(Object obj, int i, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    final boolean zzh(Object obj, zzihj zzihjVar, int i) throws IOException {
        int zzc = zzihjVar.zzc();
        int i2 = zzc >>> 3;
        int i3 = zzc & 7;
        if (i3 == 0) {
            zza(obj, i2, zzihjVar.zzh());
            return true;
        }
        if (i3 == 1) {
            zzc(obj, i2, zzihjVar.zzj());
            return true;
        }
        if (i3 == 2) {
            zzd(obj, i2, zzihjVar.zzq());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new zzige("Protocol message end-group tag did not match expected tag.");
            }
            if (i3 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i2, zzihjVar.zzk());
            return true;
        }
        Object zzf = zzf();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            throw new zzige("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzihjVar.zzb() != Integer.MAX_VALUE && zzh(zzf, zzihjVar, i5)) {
        }
        if ((i4 | 4) != zzihjVar.zzc()) {
            throw new zzige("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i2, zzg(zzf));
        return true;
    }
}
