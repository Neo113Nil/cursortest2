package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzggw extends zzgko implements zzglz {
    private static final zzggw zzb;
    private int zze;

    static {
        zzggw zzggwVar = new zzggw();
        zzb = zzggwVar;
        zzgko.zzaN(zzggw.class, zzggwVar);
    }

    private zzggw() {
    }

    public static zzggw zzc() {
        return zzb;
    }

    public static zzggw zzd(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzggw) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzggw();
        }
        zzggu zzgguVar = null;
        if (i2 == 4) {
            return new zzggv(zzgguVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
