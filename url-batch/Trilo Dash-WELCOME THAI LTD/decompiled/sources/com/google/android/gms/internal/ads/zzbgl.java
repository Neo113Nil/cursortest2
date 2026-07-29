package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbgl extends zzgko implements zzglz {
    private static final zzbgl zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzbgl zzbglVar = new zzbgl();
        zzb = zzbglVar;
        zzgko.zzaN(zzbgl.class, zzbglVar);
    }

    private zzbgl() {
    }

    public static zzbgk zza() {
        return (zzbgk) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzbgl zzbglVar, int i) {
        zzbglVar.zze |= 1;
        zzbglVar.zzf = i;
    }

    static /* synthetic */ void zze(zzbgl zzbglVar, int i) {
        zzbglVar.zze |= 2;
        zzbglVar.zzg = i;
    }

    static /* synthetic */ void zzf(zzbgl zzbglVar, int i) {
        zzbglVar.zze |= 4;
        zzbglVar.zzh = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbgl();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbgk(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
