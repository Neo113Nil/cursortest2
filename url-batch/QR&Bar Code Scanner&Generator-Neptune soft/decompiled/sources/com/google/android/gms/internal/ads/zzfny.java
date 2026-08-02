package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfny extends zzgre implements zzgsp {
    private static final zzfny zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private zzfnu zzi;

    static {
        zzfny zzfnyVar = new zzfny();
        zzb = zzfnyVar;
        zzgre.zzaQ(zzfny.class, zzfnyVar);
    }

    private zzfny() {
    }

    public static zzfnw zza() {
        return (zzfnw) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzfny zzfnyVar, String str) {
        str.getClass();
        zzfnyVar.zze |= 2;
        zzfnyVar.zzg = str;
    }

    static /* synthetic */ void zze(zzfny zzfnyVar, zzfnu zzfnuVar) {
        zzfnuVar.getClass();
        zzfnyVar.zzi = zzfnuVar;
        zzfnyVar.zze |= 8;
    }

    static /* synthetic */ void zzf(zzfny zzfnyVar, int i) {
        zzfnyVar.zzf = 1;
        zzfnyVar.zze = 1 | zzfnyVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", zzfnx.zza, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzfny();
        }
        zzfnv zzfnvVar = null;
        if (i2 == 4) {
            return new zzfnw(zzfnvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
