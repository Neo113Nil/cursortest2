package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgfm extends zzgko implements zzglz {
    private static final zzgfm zzb;
    private String zze = "";
    private zzgjg zzf = zzgjg.zzb;
    private int zzg;

    static {
        zzgfm zzgfmVar = new zzgfm();
        zzb = zzgfmVar;
        zzgko.zzaN(zzgfm.class, zzgfmVar);
    }

    private zzgfm() {
    }

    public static zzgfl zza() {
        return (zzgfl) zzb.zzaw();
    }

    public static zzgfm zzd() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzgfm zzgfmVar, String str) {
        str.getClass();
        zzgfmVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgfm();
        }
        zzgfk zzgfkVar = null;
        if (i2 == 4) {
            return new zzgfl(zzgfkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgjg zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final int zzi() {
        int zzb2 = zzggn.zzb(this.zzg);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
