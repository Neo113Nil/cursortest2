package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbic extends zzgre implements zzgsp {
    private static final zzbic zzb;
    private int zze;
    private int zzf = 1000;
    private zzbhw zzg;
    private zzbhn zzh;

    static {
        zzbic zzbicVar = new zzbic();
        zzb = zzbicVar;
        zzgre.zzaQ(zzbic.class, zzbicVar);
    }

    private zzbic() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbgc.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbic();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbib(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
