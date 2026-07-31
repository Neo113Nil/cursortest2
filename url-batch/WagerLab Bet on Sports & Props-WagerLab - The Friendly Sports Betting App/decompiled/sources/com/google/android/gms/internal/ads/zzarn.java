package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzarn extends zzhih implements zzhjt {
    private static final zzarn zzh;
    private static volatile zzhka zzi;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzarn zzarnVar = new zzarn();
        zzh = zzarnVar;
        zzhih.zzbu(zzarn.class, zzarnVar);
    }

    private zzarn() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzarn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzarm(bArr);
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
        synchronized (zzarn.class) {
            zzhkaVar = zzi;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzh);
                zzi = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
