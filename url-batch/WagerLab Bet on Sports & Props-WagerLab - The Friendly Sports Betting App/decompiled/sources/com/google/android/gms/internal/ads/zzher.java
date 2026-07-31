package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@Deprecated
/* loaded from: classes5.dex */
public final class zzher extends zzhih implements zzhjt {
    public static final /* synthetic */ int zza = 0;
    private static final zzher zzd;
    private static volatile zzhka zze;
    private String zzb = "";
    private zzhit zzc = zzbM();

    static {
        zzher zzherVar = new zzher();
        zzd = zzherVar;
        zzhih.zzbu(zzher.class, zzherVar);
    }

    private zzher() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhdy.class});
        }
        if (ordinal == 3) {
            return new zzher();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzheq(bArr);
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
        synchronized (zzher.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
