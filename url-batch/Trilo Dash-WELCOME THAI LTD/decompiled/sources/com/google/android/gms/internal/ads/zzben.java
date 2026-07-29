package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzben extends zzgko implements zzglz {
    private static final zzben zzb;
    private int zze;
    private String zzf = "";
    private zzgkx zzg = zzaH();
    private int zzh;

    static {
        zzben zzbenVar = new zzben();
        zzb = zzbenVar;
        zzgko.zzaN(zzben.class, zzbenVar);
    }

    private zzben() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzbel.class, "zzh", zzbey.zza});
        }
        if (i2 == 3) {
            return new zzben();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbem(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
