package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgdr extends zzgko implements zzglz {
    private static final zzgdr zzb;
    private zzgdu zze;

    static {
        zzgdr zzgdrVar = new zzgdr();
        zzb = zzgdrVar;
        zzgko.zzaN(zzgdr.class, zzgdrVar);
    }

    private zzgdr() {
    }

    public static zzgdq zza() {
        return (zzgdq) zzb.zzaw();
    }

    public static zzgdr zzd(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgdr) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzf(zzgdr zzgdrVar, zzgdu zzgduVar) {
        zzgduVar.getClass();
        zzgdrVar.zze = zzgduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgdr();
        }
        zzgdp zzgdpVar = null;
        if (i2 == 4) {
            return new zzgdq(zzgdpVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgdu zze() {
        zzgdu zzgduVar = this.zze;
        return zzgduVar == null ? zzgdu.zze() : zzgduVar;
    }
}
