package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgwg extends zzgre implements zzgsp {
    private static final zzgwg zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzgwg zzgwgVar = new zzgwg();
        zzb = zzgwgVar;
        zzgre.zzaQ(zzgwg.class, zzgwgVar);
    }

    private zzgwg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgwg();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgwf(zzguqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
