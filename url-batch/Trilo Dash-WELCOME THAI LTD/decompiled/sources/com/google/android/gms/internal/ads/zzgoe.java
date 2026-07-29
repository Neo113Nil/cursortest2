package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgoe extends zzgko implements zzglz {
    private static final zzgoe zzb;
    private int zze;
    private String zzf = "";

    static {
        zzgoe zzgoeVar = new zzgoe();
        zzb = zzgoeVar;
        zzgko.zzaN(zzgoe.class, zzgoeVar);
    }

    private zzgoe() {
    }

    public static zzgod zza() {
        return (zzgod) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgoe zzgoeVar, String str) {
        zzgoeVar.zze |= 1;
        zzgoeVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgoe();
        }
        zzgoa zzgoaVar = null;
        if (i2 == 4) {
            return new zzgod(zzgoaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
