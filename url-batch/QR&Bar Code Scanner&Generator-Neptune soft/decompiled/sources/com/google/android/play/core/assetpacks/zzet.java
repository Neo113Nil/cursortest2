package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
abstract class zzet {
    zzet() {
    }

    abstract int zza();

    abstract long zzb();

    abstract String zzc();

    abstract boolean zzd();

    abstract boolean zze();

    abstract byte[] zzf();

    final boolean zzg() {
        if (zzc() == null) {
            return false;
        }
        return zzc().endsWith("/");
    }

    final boolean zzh() {
        return zza() == 0;
    }
}
