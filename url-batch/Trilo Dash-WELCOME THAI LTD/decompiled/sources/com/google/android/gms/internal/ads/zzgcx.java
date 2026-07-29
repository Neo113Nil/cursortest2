package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgcx extends zzgko implements zzglz {
    private static final zzgcx zzb;
    private int zze;
    private int zzf;

    static {
        zzgcx zzgcxVar = new zzgcx();
        zzb = zzgcxVar;
        zzgko.zzaN(zzgcx.class, zzgcxVar);
    }

    private zzgcx() {
    }

    public static zzgcw zzc() {
        return (zzgcw) zzb.zzaw();
    }

    public static zzgcx zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgcx) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
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
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        if (i2 == 3) {
            return new zzgcx();
        }
        zzgcv zzgcvVar = null;
        if (i2 == 4) {
            return new zzgcw(zzgcvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
