package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfhz extends zzgko implements zzglz {
    private static final zzfhz zzb;
    private zzfhv zze;

    static {
        zzfhz zzfhzVar = new zzfhz();
        zzb = zzfhzVar;
        zzgko.zzaN(zzfhz.class, zzfhzVar);
    }

    private zzfhz() {
    }

    public static zzfhy zza() {
        return (zzfhy) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzfhz zzfhzVar, zzfhv zzfhvVar) {
        zzfhvVar.getClass();
        zzfhzVar.zze = zzfhvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzfhz();
        }
        zzfhw zzfhwVar = null;
        if (i2 == 4) {
            return new zzfhy(zzfhwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
