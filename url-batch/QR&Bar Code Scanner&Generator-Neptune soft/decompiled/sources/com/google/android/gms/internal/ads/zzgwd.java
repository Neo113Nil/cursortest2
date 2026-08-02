package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgwd extends zzgre implements zzgsp {
    private static final zzgwd zzb;
    private int zze;
    private String zzf = "";
    private zzgpw zzg = zzgpw.zzb;

    static {
        zzgwd zzgwdVar = new zzgwd();
        zzb = zzgwdVar;
        zzgre.zzaQ(zzgwd.class, zzgwdVar);
    }

    private zzgwd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgwd();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgwc(zzguqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
