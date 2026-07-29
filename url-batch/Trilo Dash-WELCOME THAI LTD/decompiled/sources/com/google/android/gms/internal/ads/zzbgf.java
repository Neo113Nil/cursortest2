package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbgf extends zzgko implements zzglz {
    private static final zzbgf zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbgf zzbgfVar = new zzbgf();
        zzb = zzbgfVar;
        zzgko.zzaN(zzbgf.class, zzbgfVar);
    }

    private zzbgf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbgf();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbge(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
