package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgbz extends zzgko implements zzglz {
    private static final zzgbz zzb;
    private zzgcc zze;
    private int zzf;

    static {
        zzgbz zzgbzVar = new zzgbz();
        zzb = zzgbzVar;
        zzgko.zzaN(zzgbz.class, zzgbzVar);
    }

    private zzgbz() {
    }

    public static zzgby zzc() {
        return (zzgby) zzb.zzaw();
    }

    public static zzgbz zze() {
        return zzb;
    }

    public static zzgbz zzf(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgbz) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzh(zzgbz zzgbzVar, zzgcc zzgccVar) {
        zzgccVar.getClass();
        zzgbzVar.zze = zzgccVar;
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
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgbz();
        }
        zzgbx zzgbxVar = null;
        if (i2 == 4) {
            return new zzgby(zzgbxVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgcc zzg() {
        zzgcc zzgccVar = this.zze;
        return zzgccVar == null ? zzgcc.zze() : zzgccVar;
    }
}
