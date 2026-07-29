package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgbw extends zzgko implements zzglz {
    private static final zzgbw zzb;
    private int zze;
    private zzgcc zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgbw zzgbwVar = new zzgbw();
        zzb = zzgbwVar;
        zzgko.zzaN(zzgbw.class, zzgbwVar);
    }

    private zzgbw() {
    }

    public static zzgbv zzc() {
        return (zzgbv) zzb.zzaw();
    }

    public static zzgbw zze() {
        return zzb;
    }

    public static zzgbw zzf(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgbw) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzj(zzgbw zzgbwVar, zzgcc zzgccVar) {
        zzgccVar.getClass();
        zzgbwVar.zzf = zzgccVar;
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
            return new zzgbw();
        }
        zzgbu zzgbuVar = null;
        if (i2 == 4) {
            return new zzgbv(zzgbuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgcc zzg() {
        zzgcc zzgccVar = this.zzf;
        return zzgccVar == null ? zzgcc.zze() : zzgccVar;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }
}
