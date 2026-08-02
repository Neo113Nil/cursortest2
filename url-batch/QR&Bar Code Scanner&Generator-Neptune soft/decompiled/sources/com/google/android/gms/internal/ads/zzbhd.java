package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbhd extends zzgre implements zzgsp {
    private static final zzbhd zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private long zzl;
    private int zzm;
    private zzgrn zzf = zzaK();
    private String zzj = "";
    private String zzk = "";

    static {
        zzbhd zzbhdVar = new zzbhd();
        zzb = zzbhdVar;
        zzgre.zzaQ(zzbhd.class, zzbhdVar);
    }

    private zzbhd() {
    }

    public static zzbgz zza() {
        return (zzbgz) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbhd zzbhdVar, Iterable iterable) {
        zzgrn zzgrnVar = zzbhdVar.zzf;
        if (!zzgrnVar.zzc()) {
            zzbhdVar.zzf = zzgre.zzaL(zzgrnVar);
        }
        zzgpf.zzau(iterable, zzbhdVar.zzf);
    }

    static /* synthetic */ void zze(zzbhd zzbhdVar, int i) {
        zzbhdVar.zze |= 1;
        zzbhdVar.zzg = i;
    }

    static /* synthetic */ void zzf(zzbhd zzbhdVar, int i) {
        zzbhdVar.zze |= 2;
        zzbhdVar.zzh = i;
    }

    static /* synthetic */ void zzg(zzbhd zzbhdVar, long j) {
        zzbhdVar.zze |= 4;
        zzbhdVar.zzi = j;
    }

    static /* synthetic */ void zzh(zzbhd zzbhdVar, String str) {
        str.getClass();
        zzbhdVar.zze |= 8;
        zzbhdVar.zzj = str;
    }

    static /* synthetic */ void zzi(zzbhd zzbhdVar, String str) {
        str.getClass();
        zzbhdVar.zze |= 16;
        zzbhdVar.zzk = str;
    }

    static /* synthetic */ void zzj(zzbhd zzbhdVar, long j) {
        zzbhdVar.zze |= 32;
        zzbhdVar.zzl = j;
    }

    static /* synthetic */ void zzk(zzbhd zzbhdVar, int i) {
        zzbhdVar.zze |= 64;
        zzbhdVar.zzm = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zze", "zzf", zzbgy.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzbhd();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbgz(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
