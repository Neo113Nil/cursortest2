package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgon extends zzgko implements zzglz {
    private static final zzgon zzb;
    private int zze;
    private int zzf;
    private zzgjg zzg = zzgjg.zzb;
    private zzgjg zzh = zzgjg.zzb;

    static {
        zzgon zzgonVar = new zzgon();
        zzb = zzgonVar;
        zzgko.zzaN(zzgon.class, zzgonVar);
    }

    private zzgon() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgon();
        }
        zzgoa zzgoaVar = null;
        if (i2 == 4) {
            return new zzgom(zzgoaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
