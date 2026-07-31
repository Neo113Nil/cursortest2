package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhcl extends zzhih implements zzhjt {
    private static final zzhcl zzd;
    private static volatile zzhka zze;
    private int zza;
    private zzhcp zzb;
    private zzhdo zzc;

    static {
        zzhcl zzhclVar = new zzhcl();
        zzd = zzhclVar;
        zzhih.zzbu(zzhcl.class, zzhclVar);
    }

    private zzhcl() {
    }

    public static zzhcl zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhcl) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzhck zzd() {
        return (zzhck) zzd.zzbn();
    }

    public final zzhcp zza() {
        zzhcp zzhcpVar = this.zzb;
        return zzhcpVar == null ? zzhcp.zzd() : zzhcpVar;
    }

    public final zzhdo zzb() {
        zzhdo zzhdoVar = this.zzc;
        return zzhdoVar == null ? zzhdo.zzg() : zzhdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhcl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhck(bArr);
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
        synchronized (zzhcl.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(zzhcp zzhcpVar) {
        zzhcpVar.getClass();
        this.zzb = zzhcpVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzhdo zzhdoVar) {
        zzhdoVar.getClass();
        this.zzc = zzhdoVar;
        this.zza |= 2;
    }
}
