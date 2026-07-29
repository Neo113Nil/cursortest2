package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbdz extends zzgko implements zzglz {
    private static final zzbdz zzb;
    private int zze;
    private int zzf;
    private zzbed zzg;
    private zzbef zzh;

    static {
        zzbdz zzbdzVar = new zzbdz();
        zzb = zzbdzVar;
        zzgko.zzaN(zzbdz.class, zzbdzVar);
    }

    private zzbdz() {
    }

    public static zzbdy zza() {
        return (zzbdy) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzbdz zzbdzVar, zzbed zzbedVar) {
        zzbedVar.getClass();
        zzbdzVar.zzg = zzbedVar;
        zzbdzVar.zze |= 2;
    }

    static /* synthetic */ void zze(zzbdz zzbdzVar, zzbef zzbefVar) {
        zzbefVar.getClass();
        zzbdzVar.zzh = zzbefVar;
        zzbdzVar.zze |= 4;
    }

    static /* synthetic */ void zzf(zzbdz zzbdzVar, int i) {
        zzbdzVar.zzf = 1;
        zzbdzVar.zze = 1 | zzbdzVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbeb.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbdz();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbdy(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
