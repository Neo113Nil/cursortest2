package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgwi extends zzgre implements zzgsp {
    private static final zzgwi zzb;
    private int zze;
    private int zzf;
    private int zzi;
    private String zzg = "";
    private zzgrj zzh = zzaH();
    private zzgrn zzj = zzaK();
    private zzgpw zzk = zzgpw.zzb;

    static {
        zzgwi zzgwiVar = new zzgwi();
        zzb = zzgwiVar;
        zzgre.zzaQ(zzgwi.class, zzgwiVar);
    }

    private zzgwi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgwg.class, "zzk"});
        }
        if (i2 == 3) {
            return new zzgwi();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgwh(zzguqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
