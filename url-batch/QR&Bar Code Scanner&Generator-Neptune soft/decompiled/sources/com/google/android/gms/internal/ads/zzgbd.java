package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgbd {
    private final zzgmc zza;

    private zzgbd(zzgmc zzgmcVar) {
        this.zza = zzgmcVar;
    }

    public static zzgbd zze(String str, byte[] bArr, int i) {
        zzgmb zza = zzgmc.zza();
        zza.zza(str);
        zza.zzb(zzgpw.zzv(bArr));
        int i2 = i - 1;
        zza.zzc(i2 != 0 ? i2 != 1 ? 5 : 4 : 3);
        return new zzgbd((zzgmc) zza.zzam());
    }

    final zzgmc zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzf();
    }

    public final byte[] zzc() {
        return this.zza.zze().zzE();
    }

    public final int zzd() {
        int zzi = this.zza.zzi() - 2;
        int i = 1;
        if (zzi != 1) {
            i = 2;
            if (zzi != 2) {
                i = 3;
                if (zzi != 3) {
                    if (zzi == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
