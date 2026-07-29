package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbfz extends zzgko implements zzglz {
    private static final zzbfz zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private long zzl;
    private zzgkx zzf = zzaH();
    private String zzj = "";
    private String zzk = "";

    static {
        zzbfz zzbfzVar = new zzbfz();
        zzb = zzbfzVar;
        zzgko.zzaN(zzbfz.class, zzbfzVar);
    }

    private zzbfz() {
    }

    public static zzbfv zza() {
        return (zzbfv) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzbfz zzbfzVar, Iterable iterable) {
        zzgkx zzgkxVar = zzbfzVar.zzf;
        if (!zzgkxVar.zzc()) {
            zzbfzVar.zzf = zzgko.zzaI(zzgkxVar);
        }
        zzgip.zzar(iterable, zzbfzVar.zzf);
    }

    static /* synthetic */ void zze(zzbfz zzbfzVar, int i) {
        zzbfzVar.zze |= 1;
        zzbfzVar.zzg = i;
    }

    static /* synthetic */ void zzf(zzbfz zzbfzVar, int i) {
        zzbfzVar.zze |= 2;
        zzbfzVar.zzh = i;
    }

    static /* synthetic */ void zzg(zzbfz zzbfzVar, long j) {
        zzbfzVar.zze |= 4;
        zzbfzVar.zzi = j;
    }

    static /* synthetic */ void zzh(zzbfz zzbfzVar, String str) {
        str.getClass();
        zzbfzVar.zze |= 8;
        zzbfzVar.zzj = str;
    }

    static /* synthetic */ void zzi(zzbfz zzbfzVar, String str) {
        str.getClass();
        zzbfzVar.zze |= 16;
        zzbfzVar.zzk = str;
    }

    static /* synthetic */ void zzj(zzbfz zzbfzVar, long j) {
        zzbfzVar.zze |= 32;
        zzbfzVar.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zze", "zzf", zzbfu.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzbfz();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbfv(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
