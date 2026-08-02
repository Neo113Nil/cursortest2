package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbhw extends zzgre implements zzgsp {
    private static final zzbhw zzb;
    private int zze;
    private int zzf;

    static {
        zzbhw zzbhwVar = new zzbhw();
        zzb = zzbhwVar;
        zzgre.zzaQ(zzbhw.class, zzbhwVar);
    }

    private zzbhw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", zzbhv.zza});
        }
        if (i2 == 3) {
            return new zzbhw();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbhu(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
