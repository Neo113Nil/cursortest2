package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgfy extends zzgko implements zzglz {
    private static final zzgfy zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgfy zzgfyVar = new zzgfy();
        zzb = zzgfyVar;
        zzgko.zzaN(zzgfy.class, zzgfyVar);
    }

    private zzgfy() {
    }

    public static zzgfx zza() {
        return (zzgfx) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgfy zzgfyVar, String str) {
        str.getClass();
        zzgfyVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgfy();
        }
        zzgfv zzgfvVar = null;
        if (i2 == 4) {
            return new zzgfx(zzgfvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
