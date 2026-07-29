package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbgu extends zzgko implements zzglz {
    private static final zzbgu zzb;
    private int zze;
    private zzbgl zzf;
    private int zzg = 1000;
    private zzbgs zzh;
    private zzbgj zzi;

    static {
        zzbgu zzbguVar = new zzbgu();
        zzb = zzbguVar;
        zzgko.zzaN(zzbgu.class, zzbguVar);
    }

    private zzbgu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", zzbey.zza, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzbgu();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbgt(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
