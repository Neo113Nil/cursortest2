package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgwm extends zzgre implements zzgsp {
    private static final zzgwm zzb;
    private int zze;
    private String zzf = "";

    static {
        zzgwm zzgwmVar = new zzgwm();
        zzb = zzgwmVar;
        zzgre.zzaQ(zzgwm.class, zzgwmVar);
    }

    private zzgwm() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgwm();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgwl(zzguqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
