package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzggl extends zzgko implements zzglz {
    private static final zzggl zzb;
    private String zze = "";
    private zzgfm zzf;

    static {
        zzggl zzgglVar = new zzggl();
        zzb = zzgglVar;
        zzgko.zzaN(zzggl.class, zzgglVar);
    }

    private zzggl() {
    }

    public static zzggl zzd() {
        return zzb;
    }

    public static zzggl zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzggl) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public final zzgfm zza() {
        zzgfm zzgfmVar = this.zzf;
        return zzgfmVar == null ? zzgfm.zzd() : zzgfmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzggl();
        }
        zzggj zzggjVar = null;
        if (i2 == 4) {
            return new zzggk(zzggjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzf != null;
    }
}
