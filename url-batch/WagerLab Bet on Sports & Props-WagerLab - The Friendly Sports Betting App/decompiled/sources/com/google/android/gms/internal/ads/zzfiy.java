package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfiy extends zzhih implements zzhjt {
    private static final zzfiy zzg;
    private static volatile zzhka zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        zzfiy zzfiyVar = new zzfiy();
        zzg = zzfiyVar;
        zzhih.zzbu(zzfiy.class, zzfiyVar);
    }

    private zzfiy() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzfiy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfix(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzh;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzfiy.class) {
            zzhkaVar = zzh;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzg);
                zzh = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
