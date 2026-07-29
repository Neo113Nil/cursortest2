package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgco extends zzgko implements zzglz {
    private static final zzgco zzb;
    private int zze;
    private zzgjg zzf = zzgjg.zzb;

    static {
        zzgco zzgcoVar = new zzgco();
        zzb = zzgcoVar;
        zzgko.zzaN(zzgco.class, zzgcoVar);
    }

    private zzgco() {
    }

    public static zzgcn zzc() {
        return (zzgcn) zzb.zzaw();
    }

    public static zzgco zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgco) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgco();
        }
        zzgcm zzgcmVar = null;
        if (i2 == 4) {
            return new zzgcn(zzgcmVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgjg zzf() {
        return this.zzf;
    }
}
