package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgjz extends zzgre implements zzgsp {
    private static final zzgjz zzb;

    static {
        zzgjz zzgjzVar = new zzgjz();
        zzb = zzgjzVar;
        zzgre.zzaQ(zzgjz.class, zzgjzVar);
    }

    private zzgjz() {
    }

    public static zzgjz zzc() {
        return zzb;
    }

    public static zzgjz zzd(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgjz) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        zzgjx zzgjxVar = null;
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new zzgjz();
        }
        if (i2 == 4) {
            return new zzgjy(zzgjxVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
