package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgfe extends zzgko implements zzglz {
    private static final zzgfe zzb;
    private int zze;
    private zzgey zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgfe zzgfeVar = new zzgfe();
        zzb = zzgfeVar;
        zzgko.zzaN(zzgfe.class, zzgfeVar);
    }

    private zzgfe() {
    }

    public static zzgfd zzd() {
        return (zzgfd) zzb.zzaw();
    }

    public static zzgfe zzf() {
        return zzb;
    }

    public static zzgfe zzg(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgfe) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzj(zzgfe zzgfeVar, zzgey zzgeyVar) {
        zzgeyVar.getClass();
        zzgfeVar.zzf = zzgeyVar;
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
            return new zzgfe();
        }
        zzgfc zzgfcVar = null;
        if (i2 == 4) {
            return new zzgfd(zzgfcVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgey zzc() {
        zzgey zzgeyVar = this.zzf;
        return zzgeyVar == null ? zzgey.zzd() : zzgeyVar;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
