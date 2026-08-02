package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbfr extends zzgre implements zzgsp {
    private static final zzbfr zzb;
    private int zze;
    private String zzf = "";
    private zzgrn zzg = zzaK();
    private int zzh;

    static {
        zzbfr zzbfrVar = new zzbfr();
        zzb = zzbfrVar;
        zzgre.zzaQ(zzbfr.class, zzbfrVar);
    }

    private zzbfr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzbfp.class, "zzh", zzbgc.zza});
        }
        if (i2 == 3) {
            return new zzbfr();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbfq(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
