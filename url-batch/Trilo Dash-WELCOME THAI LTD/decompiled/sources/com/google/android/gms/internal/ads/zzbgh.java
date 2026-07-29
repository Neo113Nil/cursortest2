package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbgh extends zzgko implements zzglz {
    private static final zzbgh zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private zzbgj zzh;

    static {
        zzbgh zzbghVar = new zzbgh();
        zzb = zzbghVar;
        zzgko.zzaN(zzbgh.class, zzbghVar);
    }

    private zzbgh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzbey.zza, "zzh"});
        }
        if (i2 == 3) {
            return new zzbgh();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbgg(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
