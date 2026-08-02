package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbhl extends zzgre implements zzgsp {
    private static final zzbhl zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private zzbhn zzh;

    static {
        zzbhl zzbhlVar = new zzbhl();
        zzb = zzbhlVar;
        zzgre.zzaQ(zzbhl.class, zzbhlVar);
    }

    private zzbhl() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzbgc.zza, "zzh"});
        }
        if (i2 == 3) {
            return new zzbhl();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbhk(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
