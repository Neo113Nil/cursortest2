package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbfp extends zzgre implements zzgsp {
    private static final zzbfp zzb;
    private int zze;
    private int zzf;
    private zzbhj zzg;

    static {
        zzbfp zzbfpVar = new zzbfp();
        zzb = zzbfpVar;
        zzgre.zzaQ(zzbfp.class, zzbfpVar);
    }

    private zzbfp() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzbfn.zzc(), "zzg"});
        }
        if (i2 == 3) {
            return new zzbfp();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbfo(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
