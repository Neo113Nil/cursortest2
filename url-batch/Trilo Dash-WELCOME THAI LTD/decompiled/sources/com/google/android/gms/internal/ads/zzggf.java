package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzggf extends zzgko implements zzglz {
    private static final zzggf zzb;
    private String zze = "";

    static {
        zzggf zzggfVar = new zzggf();
        zzb = zzggfVar;
        zzgko.zzaN(zzggf.class, zzggfVar);
    }

    private zzggf() {
    }

    public static zzggf zzc() {
        return zzb;
    }

    public static zzggf zzd(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzggf) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzggf();
        }
        zzggd zzggdVar = null;
        if (i2 == 4) {
            return new zzgge(zzggdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zze() {
        return this.zze;
    }
}
