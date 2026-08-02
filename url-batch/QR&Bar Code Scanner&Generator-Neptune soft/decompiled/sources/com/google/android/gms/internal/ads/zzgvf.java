package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgvf extends zzgre implements zzgsp {
    private static final zzgvf zzb;
    private int zze;
    private zzgve zzg;
    private long zzh;
    private String zzf = "";
    private String zzi = "";

    static {
        zzgvf zzgvfVar = new zzgvf();
        zzb = zzgvfVar;
        zzgre.zzaQ(zzgvf.class, zzgvfVar);
    }

    private zzgvf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzgvf();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgvc(zzguqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
