package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgoj extends zzgko implements zzglz {
    private static final zzgoj zzb;
    private int zze;
    private zzgjg zzf = zzgjg.zzb;
    private zzgjg zzg;
    private zzgjg zzh;

    static {
        zzgoj zzgojVar = new zzgoj();
        zzb = zzgojVar;
        zzgko.zzaN(zzgoj.class, zzgojVar);
    }

    private zzgoj() {
        zzgjg zzgjgVar = zzgjg.zzb;
        this.zzg = zzgjgVar;
        this.zzh = zzgjgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgoj();
        }
        zzgoa zzgoaVar = null;
        if (i2 == 4) {
            return new zzgoi(zzgoaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
