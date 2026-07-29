package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgfb extends zzgko implements zzglz {
    private static final zzgfb zzb;
    private int zze;
    private zzgfe zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgfb zzgfbVar = new zzgfb();
        zzb = zzgfbVar;
        zzgko.zzaN(zzgfb.class, zzgfbVar);
    }

    private zzgfb() {
    }

    public static zzgfa zzc() {
        return (zzgfa) zzb.zzaw();
    }

    public static zzgfb zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgfb) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzi(zzgfb zzgfbVar, zzgfe zzgfeVar) {
        zzgfeVar.getClass();
        zzgfbVar.zzf = zzgfeVar;
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
            return new zzgfb();
        }
        zzgez zzgezVar = null;
        if (i2 == 4) {
            return new zzgfa(zzgezVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgfe zzf() {
        zzgfe zzgfeVar = this.zzf;
        return zzgfeVar == null ? zzgfe.zzf() : zzgfeVar;
    }

    public final zzgjg zzg() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzf != null;
    }
}
