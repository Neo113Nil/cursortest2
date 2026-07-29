package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbgy extends zzgko implements zzglz {
    private static final zzbgy zzb;
    private int zze;
    private int zzf = 1000;
    private zzbgs zzg;
    private zzbgj zzh;

    static {
        zzbgy zzbgyVar = new zzbgy();
        zzb = zzbgyVar;
        zzgko.zzaN(zzbgy.class, zzbgyVar);
    }

    private zzbgy() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbey.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbgy();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbgx(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
