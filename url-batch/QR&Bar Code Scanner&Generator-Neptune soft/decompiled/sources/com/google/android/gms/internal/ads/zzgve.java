package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgve extends zzgre implements zzgsp {
    private static final zzgve zzb;
    private int zze;
    private zzgpw zzf = zzgpw.zzb;

    static {
        zzgve zzgveVar = new zzgve();
        zzb = zzgveVar;
        zzgre.zzaQ(zzgve.class, zzgveVar);
    }

    private zzgve() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgve();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgvd(zzguqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
