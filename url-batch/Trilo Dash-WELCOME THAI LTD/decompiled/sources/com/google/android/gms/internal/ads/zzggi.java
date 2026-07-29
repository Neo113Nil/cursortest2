package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzggi extends zzgko implements zzglz {
    private static final zzggi zzb;
    private int zze;
    private zzggl zzf;

    static {
        zzggi zzggiVar = new zzggi();
        zzb = zzggiVar;
        zzgko.zzaN(zzggi.class, zzggiVar);
    }

    private zzggi() {
    }

    public static zzggh zzc() {
        return (zzggh) zzb.zzaw();
    }

    public static zzggi zze(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzggi) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzh(zzggi zzggiVar, zzggl zzgglVar) {
        zzgglVar.getClass();
        zzggiVar.zzf = zzgglVar;
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
            return new zzggi();
        }
        zzggg zzgggVar = null;
        if (i2 == 4) {
            return new zzggh(zzgggVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzggl zzf() {
        zzggl zzgglVar = this.zzf;
        return zzgglVar == null ? zzggl.zzd() : zzgglVar;
    }
}
