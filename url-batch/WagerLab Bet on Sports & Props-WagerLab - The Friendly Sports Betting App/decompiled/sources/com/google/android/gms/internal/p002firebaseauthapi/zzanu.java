package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
abstract class zzanu<T, B> {
    private static volatile int zza = 100;

    abstract int zza(T t);

    abstract B zza();

    abstract T zza(T t, T t2);

    abstract void zza(B b, int i, int i2);

    abstract void zza(B b, int i, long j);

    abstract void zza(B b, int i, zzajv zzajvVar);

    abstract void zza(B b, int i, T t);

    abstract void zza(T t, zzaol zzaolVar) throws IOException;

    abstract boolean zza(zzanc zzancVar);

    abstract int zzb(T t);

    abstract void zzb(B b, int i, long j);

    abstract void zzb(T t, zzaol zzaolVar) throws IOException;

    abstract void zzb(Object obj, B b);

    abstract B zzc(Object obj);

    abstract void zzc(Object obj, T t);

    abstract T zzd(Object obj);

    abstract T zze(B b);

    abstract void zzf(Object obj);

    zzanu() {
    }

    final boolean zza(B b, zzanc zzancVar, int i) throws IOException {
        int zzd = zzancVar.zzd();
        int i2 = zzd >>> 3;
        int i3 = zzd & 7;
        if (i3 == 0) {
            zzb(b, i2, zzancVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zza((zzanu<T, B>) b, i2, zzancVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zza((zzanu<T, B>) b, i2, zzancVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw zzall.zzb();
            }
            if (i3 == 5) {
                zza((zzanu<T, B>) b, i2, zzancVar.zzf());
                return true;
            }
            throw zzall.zza();
        }
        B zza2 = zza();
        int i4 = 4 | (i2 << 3);
        int i5 = i + 1;
        if (i5 >= zza) {
            throw zzall.zzh();
        }
        while (zzancVar.zzc() != Integer.MAX_VALUE && zza((zzanu<T, B>) zza2, zzancVar, i5)) {
        }
        if (i4 != zzancVar.zzd()) {
            throw zzall.zzb();
        }
        zza((zzanu<T, B>) b, i2, (int) zze(zza2));
        return true;
    }
}
