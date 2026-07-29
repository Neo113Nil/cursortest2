package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgen extends zzgko implements zzglz {
    private static final zzgen zzb;
    private zzgeq zze;
    private int zzf;
    private int zzg;

    static {
        zzgen zzgenVar = new zzgen();
        zzb = zzgenVar;
        zzgko.zzaN(zzgen.class, zzgenVar);
    }

    private zzgen() {
    }

    public static zzgem zzc() {
        return (zzgem) zzb.zzaw();
    }

    public static zzgen zze() {
        return zzb;
    }

    public static zzgen zzf(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgen) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzh(zzgen zzgenVar, zzgeq zzgeqVar) {
        zzgeqVar.getClass();
        zzgenVar.zze = zzgeqVar;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgen();
        }
        zzgel zzgelVar = null;
        if (i2 == 4) {
            return new zzgem(zzgelVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgeq zzg() {
        zzgeq zzgeqVar = this.zze;
        return zzgeqVar == null ? zzgeq.zze() : zzgeqVar;
    }
}
