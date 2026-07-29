package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgdx extends zzgko implements zzglz {
    private static final zzgdx zzb;
    private int zze;
    private zzgea zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgdx zzgdxVar = new zzgdx();
        zzb = zzgdxVar;
        zzgko.zzaN(zzgdx.class, zzgdxVar);
    }

    private zzgdx() {
    }

    public static zzgdw zzc() {
        return (zzgdw) zzb.zzaw();
    }

    public static zzgdx zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgdx) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzi(zzgdx zzgdxVar, zzgea zzgeaVar) {
        zzgeaVar.getClass();
        zzgdxVar.zzf = zzgeaVar;
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
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgdx();
        }
        zzgdv zzgdvVar = null;
        if (i2 == 4) {
            return new zzgdw(zzgdvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgea zzf() {
        zzgea zzgeaVar = this.zzf;
        return zzgeaVar == null ? zzgea.zzf() : zzgeaVar;
    }

    public final zzgjg zzg() {
        return this.zzg;
    }
}
