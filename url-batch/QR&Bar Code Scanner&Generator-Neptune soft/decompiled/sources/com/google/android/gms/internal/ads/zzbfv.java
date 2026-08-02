package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbfv extends zzgre implements zzgsp {
    private static final zzbfv zzb;
    private int zze;
    private int zzf;
    private zzbhn zzg;
    private zzbhn zzh;
    private zzbhn zzi;
    private zzgrn zzj = zzaK();
    private int zzk;

    static {
        zzbfv zzbfvVar = new zzbfv();
        zzb = zzbfvVar;
        zzgre.zzaQ(zzbfv.class, zzbfvVar);
    }

    private zzbfv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzbhn.class, "zzk"});
        }
        if (i2 == 3) {
            return new zzbfv();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbfu(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
