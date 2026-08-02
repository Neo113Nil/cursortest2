package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgvk extends zzgre implements zzgsp {
    private static final zzgvk zzb;
    private int zze;
    private zzgpw zzf = zzgpw.zzb;
    private zzgpw zzg;
    private zzgpw zzh;

    static {
        zzgvk zzgvkVar = new zzgvk();
        zzb = zzgvkVar;
        zzgre.zzaQ(zzgvk.class, zzgvkVar);
    }

    private zzgvk() {
        zzgpw zzgpwVar = zzgpw.zzb;
        this.zzg = zzgpwVar;
        this.zzh = zzgpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgvk();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgvj(zzguqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
