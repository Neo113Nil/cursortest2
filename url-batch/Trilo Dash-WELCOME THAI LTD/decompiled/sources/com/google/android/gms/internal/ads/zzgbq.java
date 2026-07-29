package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgbq extends zzgko implements zzglz {
    private static final zzgbq zzb;
    private int zze;
    private zzgbw zzf;
    private zzgek zzg;

    static {
        zzgbq zzgbqVar = new zzgbq();
        zzb = zzgbqVar;
        zzgko.zzaN(zzgbq.class, zzgbqVar);
    }

    private zzgbq() {
    }

    public static zzgbp zzc() {
        return (zzgbp) zzb.zzaw();
    }

    public static zzgbq zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgbq) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzi(zzgbq zzgbqVar, zzgbw zzgbwVar) {
        zzgbwVar.getClass();
        zzgbqVar.zzf = zzgbwVar;
    }

    static /* synthetic */ void zzj(zzgbq zzgbqVar, zzgek zzgekVar) {
        zzgekVar.getClass();
        zzgbqVar.zzg = zzgekVar;
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
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgbq();
        }
        zzgbo zzgboVar = null;
        if (i2 == 4) {
            return new zzgbp(zzgboVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgbw zzf() {
        zzgbw zzgbwVar = this.zzf;
        return zzgbwVar == null ? zzgbw.zze() : zzgbwVar;
    }

    public final zzgek zzg() {
        zzgek zzgekVar = this.zzg;
        return zzgekVar == null ? zzgek.zze() : zzgekVar;
    }
}
