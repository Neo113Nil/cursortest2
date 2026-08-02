package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgla extends zzgre implements zzgsp {
    private static final zzgla zzb;
    private int zze;
    private zzglg zzf;
    private zzgpw zzg = zzgpw.zzb;

    static {
        zzgla zzglaVar = new zzgla();
        zzb = zzglaVar;
        zzgre.zzaQ(zzgla.class, zzglaVar);
    }

    private zzgla() {
    }

    public static zzgkz zzc() {
        return (zzgkz) zzb.zzaz();
    }

    public static zzgla zze() {
        return zzb;
    }

    public static zzgla zzf(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgla) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzj(zzgla zzglaVar, zzglg zzglgVar) {
        zzglgVar.getClass();
        zzglaVar.zzf = zzglgVar;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgla();
        }
        zzgky zzgkyVar = null;
        if (i2 == 4) {
            return new zzgkz(zzgkyVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzglg zzg() {
        zzglg zzglgVar = this.zzf;
        return zzglgVar == null ? zzglg.zze() : zzglgVar;
    }

    public final zzgpw zzh() {
        return this.zzg;
    }
}
