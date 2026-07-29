package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbfd extends zzgko implements zzglz {
    private static final zzbfd zzb;
    private int zze;
    private int zzg;
    private zzbgj zzi;
    private String zzf = "";
    private zzgkt zzh = zzaE();

    static {
        zzbfd zzbfdVar = new zzbfd();
        zzb = zzbfdVar;
        zzgko.zzaN(zzbfd.class, zzbfdVar);
    }

    private zzbfd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzbey.zza, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzbfd();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbfc(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
