package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgcf extends zzgko implements zzglz {
    private static final zzgcf zzb;
    private int zze;
    private zzgcl zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgcf zzgcfVar = new zzgcf();
        zzb = zzgcfVar;
        zzgko.zzaN(zzgcf.class, zzgcfVar);
    }

    private zzgcf() {
    }

    public static zzgce zzc() {
        return (zzgce) zzb.zzaw();
    }

    public static zzgcf zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgcf) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzi(zzgcf zzgcfVar, zzgcl zzgclVar) {
        zzgclVar.getClass();
        zzgcfVar.zzf = zzgclVar;
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
            return new zzgcf();
        }
        zzgcd zzgcdVar = null;
        if (i2 == 4) {
            return new zzgce(zzgcdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgcl zzf() {
        zzgcl zzgclVar = this.zzf;
        return zzgclVar == null ? zzgcl.zze() : zzgclVar;
    }

    public final zzgjg zzg() {
        return this.zzg;
    }
}
