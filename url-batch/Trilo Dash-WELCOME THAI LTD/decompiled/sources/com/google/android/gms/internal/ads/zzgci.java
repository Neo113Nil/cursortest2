package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgci extends zzgko implements zzglz {
    private static final zzgci zzb;
    private zzgcl zze;
    private int zzf;

    static {
        zzgci zzgciVar = new zzgci();
        zzb = zzgciVar;
        zzgko.zzaN(zzgci.class, zzgciVar);
    }

    private zzgci() {
    }

    public static zzgch zzc() {
        return (zzgch) zzb.zzaw();
    }

    public static zzgci zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgci) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzg(zzgci zzgciVar, zzgcl zzgclVar) {
        zzgclVar.getClass();
        zzgciVar.zze = zzgclVar;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgci();
        }
        zzgcg zzgcgVar = null;
        if (i2 == 4) {
            return new zzgch(zzgcgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgcl zzf() {
        zzgcl zzgclVar = this.zze;
        return zzgclVar == null ? zzgcl.zze() : zzgclVar;
    }
}
