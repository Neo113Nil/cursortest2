package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhox extends zzhih implements zzhjt {
    private static final zzhox zzh;
    private static volatile zzhka zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private zzhip zzd = zzbC();
    private zzhit zzf = zzbM();
    private zzhhb zzg = zzhhb.zzb;

    static {
        zzhox zzhoxVar = new zzhox();
        zzh = zzhoxVar;
        zzhih.zzbu(zzhox.class, zzhoxVar);
    }

    private zzhox() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", zzhov.class, "zzg"});
        }
        if (ordinal == 3) {
            return new zzhox();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhow(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzi;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhox.class) {
            zzhkaVar = zzi;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzh);
                zzi = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
