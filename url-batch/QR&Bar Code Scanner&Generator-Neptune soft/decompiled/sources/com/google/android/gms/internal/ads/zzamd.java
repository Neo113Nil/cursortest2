package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzamd extends zzgre implements zzgsp {
    private static final zzamd zzb;
    private int zze;
    private zzamf zzf;
    private zzami zzg;

    static {
        zzamd zzamdVar = new zzamd();
        zzb = zzamdVar;
        zzgre.zzaQ(zzamd.class, zzamdVar);
    }

    private zzamd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzamd();
        }
        zzamb zzambVar = null;
        if (i2 == 4) {
            return new zzamc(zzambVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
