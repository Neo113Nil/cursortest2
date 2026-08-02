package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzarv extends zzgre implements zzgsp {
    private static final zzarv zzb;
    private int zze;
    private zzary zzf;
    private zzgpw zzg = zzgpw.zzb;
    private zzgpw zzh = zzgpw.zzb;

    static {
        zzarv zzarvVar = new zzarv();
        zzb = zzarvVar;
        zzgre.zzaQ(zzarv.class, zzarvVar);
    }

    private zzarv() {
    }

    public static zzarv zzc(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzarv) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzarv();
        }
        zzart zzartVar = null;
        if (i2 == 4) {
            return new zzaru(zzartVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzary zzd() {
        zzary zzaryVar = this.zzf;
        return zzaryVar == null ? zzary.zzg() : zzaryVar;
    }

    public final zzgpw zze() {
        return this.zzh;
    }

    public final zzgpw zzf() {
        return this.zzg;
    }
}
