package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhev extends zzhih implements zzhjt {
    private static final zzhev zzd;
    private static volatile zzhka zze;
    private int zza;
    private int zzb;
    private zzhex zzc;

    static {
        zzhev zzhevVar = new zzhev();
        zzd = zzhevVar;
        zzhih.zzbu(zzhev.class, zzhevVar);
    }

    private zzhev() {
    }

    public static zzhev zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhev) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzheu zzd() {
        return (zzheu) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhex zzb() {
        zzhex zzhexVar = this.zzc;
        return zzhexVar == null ? zzhex.zzc() : zzhexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhev();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzheu(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zze;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhev.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(zzhex zzhexVar) {
        zzhexVar.getClass();
        this.zzc = zzhexVar;
        this.zza |= 1;
    }
}
