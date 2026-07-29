package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbff extends zzgko implements zzglz {
    private static final zzbff zzb;
    private int zze;
    private int zzf;
    private zzgkt zzg = zzaE();

    static {
        zzbff zzbffVar = new zzbff();
        zzb = zzbffVar;
        zzgko.zzaN(zzbff.class, zzbffVar);
    }

    private zzbff() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zze", "zzf", zzbey.zza, "zzg"});
        }
        if (i2 == 3) {
            return new zzbff();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbfe(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
