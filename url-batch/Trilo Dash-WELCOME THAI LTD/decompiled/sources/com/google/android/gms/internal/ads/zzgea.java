package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgea extends zzgko implements zzglz {
    private static final zzgea zzb;
    private int zze;
    private zzgdu zzf;
    private zzgjg zzg = zzgjg.zzb;
    private zzgjg zzh = zzgjg.zzb;

    static {
        zzgea zzgeaVar = new zzgea();
        zzb = zzgeaVar;
        zzgko.zzaN(zzgea.class, zzgeaVar);
    }

    private zzgea() {
    }

    public static zzgdz zzd() {
        return (zzgdz) zzb.zzaw();
    }

    public static zzgea zzf() {
        return zzb;
    }

    public static zzgea zzg(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgea) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzj(zzgea zzgeaVar, int i) {
        zzgeaVar.zze = 0;
    }

    static /* synthetic */ void zzk(zzgea zzgeaVar, zzgdu zzgduVar) {
        zzgduVar.getClass();
        zzgeaVar.zzf = zzgduVar;
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
            return zzaM(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgea();
        }
        zzgdy zzgdyVar = null;
        if (i2 == 4) {
            return new zzgdz(zzgdyVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgdu zzc() {
        zzgdu zzgduVar = this.zzf;
        return zzgduVar == null ? zzgdu.zze() : zzgduVar;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }

    public final zzgjg zzi() {
        return this.zzh;
    }
}
