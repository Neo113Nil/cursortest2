package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbeg extends zzgko implements zzglz {
    private static final zzbeg zzb;
    private zzgkx zze = zzaH();

    static {
        zzbeg zzbegVar = new zzbeg();
        zzb = zzbegVar;
        zzgko.zzaN(zzbeg.class, zzbegVar);
    }

    private zzbeg() {
    }

    public static zzbea zza() {
        return (zzbea) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzbeg zzbegVar, zzbdz zzbdzVar) {
        zzbdzVar.getClass();
        zzgkx zzgkxVar = zzbegVar.zze;
        if (!zzgkxVar.zzc()) {
            zzbegVar.zze = zzgko.zzaI(zzgkxVar);
        }
        zzbegVar.zze.add(zzbdzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzbdz.class});
        }
        if (i2 == 3) {
            return new zzbeg();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbea(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
