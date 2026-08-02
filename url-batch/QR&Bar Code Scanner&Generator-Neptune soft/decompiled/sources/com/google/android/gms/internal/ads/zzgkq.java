package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgkq extends zzgre implements zzgsp {
    private static final zzgkq zzb;
    private int zze;
    private zzgkk zzf;
    private zzgpw zzg = zzgpw.zzb;
    private zzgpw zzh = zzgpw.zzb;

    static {
        zzgkq zzgkqVar = new zzgkq();
        zzb = zzgkqVar;
        zzgre.zzaQ(zzgkq.class, zzgkqVar);
    }

    private zzgkq() {
    }

    public static zzgkp zzd() {
        return (zzgkp) zzb.zzaz();
    }

    public static zzgkq zzf() {
        return zzb;
    }

    public static zzgkq zzg(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgkq) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzk(zzgkq zzgkqVar, zzgkk zzgkkVar) {
        zzgkkVar.getClass();
        zzgkqVar.zzf = zzgkkVar;
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
            return zzaP(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgkq();
        }
        zzgko zzgkoVar = null;
        if (i2 == 4) {
            return new zzgkp(zzgkoVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkk zzc() {
        zzgkk zzgkkVar = this.zzf;
        return zzgkkVar == null ? zzgkk.zze() : zzgkkVar;
    }

    public final zzgpw zzh() {
        return this.zzg;
    }

    public final zzgpw zzi() {
        return this.zzh;
    }
}
