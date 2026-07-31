package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhlz extends zzhih implements zzhjt {
    private static final zzhlz zzc;
    private static volatile zzhka zzd;
    private zzhip zza = zzbC();
    private zzhip zzb = zzbC();

    static {
        zzhlz zzhlzVar = new zzhlz();
        zzc = zzhlzVar;
        zzhih.zzbu(zzhlz.class, zzhlzVar);
    }

    private zzhlz() {
    }

    public static zzhlz zzc(byte[] bArr, zzhhr zzhhrVar) throws zzhiw {
        return (zzhlz) zzhih.zzbV(zzc, bArr, zzhhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhlz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhly(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzd;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhlz.class) {
            zzhkaVar = zzd;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzc);
                zzd = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
