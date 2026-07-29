package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgbh extends zzgko implements zzglz {
    private static final zzgbh zzb;
    private int zze;
    private zzgjg zzf = zzgjg.zzb;
    private zzgbn zzg;

    static {
        zzgbh zzgbhVar = new zzgbh();
        zzb = zzgbhVar;
        zzgko.zzaN(zzgbh.class, zzgbhVar);
    }

    private zzgbh() {
    }

    public static zzgbg zzc() {
        return (zzgbg) zzb.zzaw();
    }

    public static zzgbh zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgbh) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzj(zzgbh zzgbhVar, zzgbn zzgbnVar) {
        zzgbnVar.getClass();
        zzgbhVar.zzg = zzgbnVar;
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
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgbh();
        }
        zzgbf zzgbfVar = null;
        if (i2 == 4) {
            return new zzgbg(zzgbfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgbn zzf() {
        zzgbn zzgbnVar = this.zzg;
        return zzgbnVar == null ? zzgbn.zze() : zzgbnVar;
    }

    public final zzgjg zzg() {
        return this.zzf;
    }
}
