package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhei extends zzhih implements zzhjt {
    private static final zzhei zzd;
    private static volatile zzhka zze;
    private int zza;
    private int zzb;
    private zzhek zzc;

    static {
        zzhei zzheiVar = new zzhei();
        zzd = zzheiVar;
        zzhih.zzbu(zzhei.class, zzheiVar);
    }

    private zzhei() {
    }

    public static zzhei zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhei) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzheh zzd() {
        return (zzheh) zzd.zzbn();
    }

    public static zzhka zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhek zzb() {
        zzhek zzhekVar = this.zzc;
        return zzhekVar == null ? zzhek.zzd() : zzhekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhei();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzheh(bArr);
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
        synchronized (zzhei.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzg(zzhek zzhekVar) {
        zzhekVar.getClass();
        this.zzc = zzhekVar;
        this.zza |= 1;
    }
}
