package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbgs extends zzgko implements zzglz {
    private static final zzbgs zzb;
    private int zze;
    private int zzf;

    static {
        zzbgs zzbgsVar = new zzbgs();
        zzb = zzbgsVar;
        zzgko.zzaN(zzbgs.class, zzbgsVar);
    }

    private zzbgs() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", zzbgr.zza});
        }
        if (i2 == 3) {
            return new zzbgs();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbgq(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
