package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaxs extends zzhih implements zzhjt {
    private static final zzaxs zze;
    private static volatile zzhka zzf;
    private int zza;
    private zzaxw zzb;
    private zzhhb zzc;
    private zzhhb zzd;

    static {
        zzaxs zzaxsVar = new zzaxs();
        zze = zzaxsVar;
        zzhih.zzbu(zzaxs.class, zzaxsVar);
    }

    private zzaxs() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzc = zzhhbVar;
        this.zzd = zzhhbVar;
    }

    public static zzaxs zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzaxs) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzaxs zze(byte[] bArr, zzhhr zzhhrVar) throws zzhiw {
        return (zzaxs) zzhih.zzbV(zze, bArr, zzhhrVar);
    }

    public final zzaxw zza() {
        zzaxw zzaxwVar = this.zzb;
        return zzaxwVar == null ? zzaxw.zzj() : zzaxwVar;
    }

    public final zzhhb zzb() {
        return this.zzc;
    }

    public final zzhhb zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzaxs();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxr(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzf;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzaxs.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
