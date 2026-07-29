package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgdj extends zzgko implements zzglz {
    private static final zzgdj zzb;

    static {
        zzgdj zzgdjVar = new zzgdj();
        zzb = zzgdjVar;
        zzgko.zzaN(zzgdj.class, zzgdjVar);
    }

    private zzgdj() {
    }

    public static zzgdj zzc() {
        return zzb;
    }

    public static zzgdj zzd(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgdj) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        zzgdh zzgdhVar = null;
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new zzgdj();
        }
        if (i2 == 4) {
            return new zzgdi(zzgdhVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
