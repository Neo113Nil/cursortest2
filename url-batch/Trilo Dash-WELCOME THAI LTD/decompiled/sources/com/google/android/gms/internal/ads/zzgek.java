package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgek extends zzgko implements zzglz {
    private static final zzgek zzb;
    private int zze;
    private zzgeq zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgek zzgekVar = new zzgek();
        zzb = zzgekVar;
        zzgko.zzaN(zzgek.class, zzgekVar);
    }

    private zzgek() {
    }

    public static zzgej zzc() {
        return (zzgej) zzb.zzaw();
    }

    public static zzgek zze() {
        return zzb;
    }

    public static zzgek zzf(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgek) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzj(zzgek zzgekVar, zzgeq zzgeqVar) {
        zzgeqVar.getClass();
        zzgekVar.zzf = zzgeqVar;
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
            return new zzgek();
        }
        zzgei zzgeiVar = null;
        if (i2 == 4) {
            return new zzgej(zzgeiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgeq zzg() {
        zzgeq zzgeqVar = this.zzf;
        return zzgeqVar == null ? zzgeq.zze() : zzgeqVar;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }
}
