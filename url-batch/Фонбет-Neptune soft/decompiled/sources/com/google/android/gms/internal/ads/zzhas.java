package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
abstract class zzhas {
    zzhas() {
    }

    abstract Object zza(Object obj);

    abstract Object zzb();

    abstract Object zzc(Object obj);

    abstract void zzd(Object obj, int i, int i2);

    abstract void zze(Object obj, int i, long j);

    abstract void zzf(Object obj, int i, Object obj2);

    abstract void zzg(Object obj, int i, zzgwm zzgwmVar);

    abstract void zzh(Object obj, int i, long j);

    abstract void zzi(Object obj);

    final boolean zzj(Object obj, zzgzw zzgzwVar) throws IOException {
        int zzd = zzgzwVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzh(obj, i, zzgzwVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zze(obj, i, zzgzwVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzg(obj, i, zzgzwVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzgyn.zza();
            }
            zzd(obj, i, zzgzwVar.zzf());
            return true;
        }
        Object zzb = zzb();
        int i3 = i << 3;
        while (zzgzwVar.zzc() != Integer.MAX_VALUE && zzj(zzb, zzgzwVar)) {
        }
        if ((4 | i3) != zzgzwVar.zzd()) {
            throw zzgyn.zzb();
        }
        zzc(zzb);
        zzf(obj, i, zzb);
        return true;
    }
}
