package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgfz extends zzgko implements zzglz {
    private static final zzgfz zzb;
    private int zze;
    private zzgkx zzf = zzaH();

    static {
        zzgfz zzgfzVar = new zzgfz();
        zzb = zzgfzVar;
        zzgko.zzaN(zzgfz.class, zzgfzVar);
    }

    private zzgfz() {
    }

    public static zzgfw zza() {
        return (zzgfw) zzb.zzaw();
    }

    static /* synthetic */ void zze(zzgfz zzgfzVar, zzgfy zzgfyVar) {
        zzgfyVar.getClass();
        zzgkx zzgkxVar = zzgfzVar.zzf;
        if (!zzgkxVar.zzc()) {
            zzgfzVar.zzf = zzgko.zzaI(zzgkxVar);
        }
        zzgfzVar.zzf.add(zzgfyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgfy.class});
        }
        if (i2 == 3) {
            return new zzgfz();
        }
        zzgfv zzgfvVar = null;
        if (i2 == 4) {
            return new zzgfw(zzgfvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
