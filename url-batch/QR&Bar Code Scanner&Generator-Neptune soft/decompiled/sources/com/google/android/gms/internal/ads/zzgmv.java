package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgmv extends zzgre implements zzgsp {
    private static final zzgmv zzb;
    private String zze = "";

    static {
        zzgmv zzgmvVar = new zzgmv();
        zzb = zzgmvVar;
        zzgre.zzaQ(zzgmv.class, zzgmvVar);
    }

    private zzgmv() {
    }

    public static zzgmv zzc() {
        return zzb;
    }

    public static zzgmv zzd(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgmv) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgmv();
        }
        zzgmt zzgmtVar = null;
        if (i2 == 4) {
            return new zzgmu(zzgmtVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zze() {
        return this.zze;
    }
}
