package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgbt extends zzgko implements zzglz {
    private static final zzgbt zzb;
    private zzgbz zze;
    private zzgen zzf;

    static {
        zzgbt zzgbtVar = new zzgbt();
        zzb = zzgbtVar;
        zzgko.zzaN(zzgbt.class, zzgbtVar);
    }

    private zzgbt() {
    }

    public static zzgbs zza() {
        return (zzgbs) zzb.zzaw();
    }

    public static zzgbt zzd(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgbt) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzg(zzgbt zzgbtVar, zzgbz zzgbzVar) {
        zzgbzVar.getClass();
        zzgbtVar.zze = zzgbzVar;
    }

    static /* synthetic */ void zzh(zzgbt zzgbtVar, zzgen zzgenVar) {
        zzgenVar.getClass();
        zzgbtVar.zzf = zzgenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgbt();
        }
        zzgbr zzgbrVar = null;
        if (i2 == 4) {
            return new zzgbs(zzgbrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgbz zze() {
        zzgbz zzgbzVar = this.zze;
        return zzgbzVar == null ? zzgbz.zze() : zzgbzVar;
    }

    public final zzgen zzf() {
        zzgen zzgenVar = this.zzf;
        return zzgenVar == null ? zzgen.zze() : zzgenVar;
    }
}
