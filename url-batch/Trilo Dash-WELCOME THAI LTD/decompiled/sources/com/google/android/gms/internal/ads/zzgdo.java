package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgdo extends zzgko implements zzglz {
    private static final zzgdo zzb;
    private zzgfm zze;

    static {
        zzgdo zzgdoVar = new zzgdo();
        zzb = zzgdoVar;
        zzgko.zzaN(zzgdo.class, zzgdoVar);
    }

    private zzgdo() {
    }

    public static zzgdn zza() {
        return (zzgdn) zzb.zzaw();
    }

    public static zzgdo zzd() {
        return zzb;
    }

    static /* synthetic */ void zzf(zzgdo zzgdoVar, zzgfm zzgfmVar) {
        zzgfmVar.getClass();
        zzgdoVar.zze = zzgfmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgdo();
        }
        zzgdm zzgdmVar = null;
        if (i2 == 4) {
            return new zzgdn(zzgdmVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgfm zze() {
        zzgfm zzgfmVar = this.zze;
        return zzgfmVar == null ? zzgfm.zzd() : zzgfmVar;
    }
}
