package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzggc extends zzgko implements zzglz {
    private static final zzggc zzb;
    private int zze;
    private zzggf zzf;

    static {
        zzggc zzggcVar = new zzggc();
        zzb = zzggcVar;
        zzgko.zzaN(zzggc.class, zzggcVar);
    }

    private zzggc() {
    }

    public static zzggb zzc() {
        return (zzggb) zzb.zzaw();
    }

    public static zzggc zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzggc) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzh(zzggc zzggcVar, zzggf zzggfVar) {
        zzggfVar.getClass();
        zzggcVar.zzf = zzggfVar;
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
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzggc();
        }
        zzgga zzggaVar = null;
        if (i2 == 4) {
            return new zzggb(zzggaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzggf zzf() {
        zzggf zzggfVar = this.zzf;
        return zzggfVar == null ? zzggf.zzc() : zzggfVar;
    }
}
