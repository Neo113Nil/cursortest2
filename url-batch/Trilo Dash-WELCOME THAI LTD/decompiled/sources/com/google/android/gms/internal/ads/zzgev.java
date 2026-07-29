package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgev extends zzgko implements zzglz {
    private static final zzgev zzb;
    private zzgey zze;

    static {
        zzgev zzgevVar = new zzgev();
        zzb = zzgevVar;
        zzgko.zzaN(zzgev.class, zzgevVar);
    }

    private zzgev() {
    }

    public static zzgeu zza() {
        return (zzgeu) zzb.zzaw();
    }

    public static zzgev zzd(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgev) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzf(zzgev zzgevVar, zzgey zzgeyVar) {
        zzgeyVar.getClass();
        zzgevVar.zze = zzgeyVar;
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
            return new zzgev();
        }
        zzget zzgetVar = null;
        if (i2 == 4) {
            return new zzgeu(zzgetVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgey zze() {
        zzgey zzgeyVar = this.zze;
        return zzgeyVar == null ? zzgey.zzd() : zzgeyVar;
    }
}
