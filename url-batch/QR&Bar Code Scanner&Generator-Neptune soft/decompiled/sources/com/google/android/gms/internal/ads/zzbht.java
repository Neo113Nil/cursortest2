package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbht extends zzgre implements zzgsp {
    private static final zzbht zzb;
    private int zze;
    private int zzf = 1000;
    private zzbhw zzg;
    private zzbhn zzh;

    static {
        zzbht zzbhtVar = new zzbht();
        zzb = zzbhtVar;
        zzgre.zzaQ(zzbht.class, zzbhtVar);
    }

    private zzbht() {
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
            return new zzbht();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbhs(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
