package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhos extends zzhih implements zzhjt {
    private static final zzhos zzd;
    private static volatile zzhka zze;
    private int zza;
    private int zzb;
    private String zzc = "";

    static {
        zzhos zzhosVar = new zzhos();
        zzd = zzhosVar;
        zzhih.zzbu(zzhos.class, zzhosVar);
    }

    private zzhos() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", zzhor.zza, "zzc"});
        }
        if (ordinal == 3) {
            return new zzhos();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhoq(bArr);
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
        synchronized (zzhos.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
