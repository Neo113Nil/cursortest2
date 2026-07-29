package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaqr extends zzgko implements zzglz {
    private static final zzaqr zzb;
    private int zze;
    private zzaqu zzf;
    private zzgjg zzg = zzgjg.zzb;
    private zzgjg zzh = zzgjg.zzb;

    static {
        zzaqr zzaqrVar = new zzaqr();
        zzb = zzaqrVar;
        zzgko.zzaN(zzaqr.class, zzaqrVar);
    }

    private zzaqr() {
    }

    public static zzaqr zzc(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzaqr) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzaqr();
        }
        zzaqp zzaqpVar = null;
        if (i2 == 4) {
            return new zzaqq(zzaqpVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaqu zzd() {
        zzaqu zzaquVar = this.zzf;
        return zzaquVar == null ? zzaqu.zzg() : zzaquVar;
    }

    public final zzgjg zze() {
        return this.zzh;
    }

    public final zzgjg zzf() {
        return this.zzg;
    }
}
