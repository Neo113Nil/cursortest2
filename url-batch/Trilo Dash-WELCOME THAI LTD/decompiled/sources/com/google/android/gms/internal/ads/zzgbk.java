package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgbk extends zzgko implements zzglz {
    private static final zzgbk zzb;
    private int zze;
    private zzgbn zzf;

    static {
        zzgbk zzgbkVar = new zzgbk();
        zzb = zzgbkVar;
        zzgko.zzaN(zzgbk.class, zzgbkVar);
    }

    private zzgbk() {
    }

    public static zzgbj zzc() {
        return (zzgbj) zzb.zzaw();
    }

    public static zzgbk zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzgbk) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzh(zzgbk zzgbkVar, zzgbn zzgbnVar) {
        zzgbnVar.getClass();
        zzgbkVar.zzf = zzgbnVar;
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
            return new zzgbk();
        }
        zzgbi zzgbiVar = null;
        if (i2 == 4) {
            return new zzgbj(zzgbiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgbn zzf() {
        zzgbn zzgbnVar = this.zzf;
        return zzgbnVar == null ? zzgbn.zze() : zzgbnVar;
    }
}
